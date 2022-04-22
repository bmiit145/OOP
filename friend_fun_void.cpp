#include<iostream>
using namespace std;
// int Add(num1 a, num2 b);    pre declare not allowed
class num2;
class num1{
        int n1;
    public:
        void getdata(){
            cout << "Enter the number 1 :\t";
            cin >> n1;
        }
    friend int Add(num1 a , num2 b);      // friend to function where object is parameter
};
class num2{
        int n2;
    public:
        void getdata(){
            cout << "Enter the number 2 :\t";
            cin >> n2;
        }
    friend int Add(num1 a, num2 b);        // friend to function where object is parameter 
};
int Add(num1 a , num2 b){
    return a.n1 + b.n2;     //  access the data from object a and b
}

int main()
{
    num1 a;
    a.getdata();
    num2 b;
    b.getdata();
    int total = Add(a , b);   // passing the actual data ...

    cout << "Total :: \t " << total << endl;  // display result
    return 0;
}
