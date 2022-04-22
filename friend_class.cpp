#include <iostream>
using namespace std;
class Two;
class One
{
    int salary;

public:
    void getdata(int x = 500 )
    {
        salary = x;
    }
    friend Two;         // all property can access by  Two
};

class Two
{
public:
    int salary2;
    int total;


    public :  
    Two(){                  // constructor
    }

    void getdata(){
        cout << "Salary 2 : " ;
        cin >> salary2;
    }

    void calculate(One a)
    {                                          // calculate salary of One + Salary2 of Two using declare friend Two ,  but we need to pass an object of a complasary.
        total = salary2 + a.salary;
    }

    void display()
    {
        cout << "Total : " << total << endl;
    }
};

int main()
{
    /* code */
    One d;
    Two e;

    d.getdata();
    e.getdata();
    e.calculate(d);             // pass object of One
    e.display();
    return 0;
}
