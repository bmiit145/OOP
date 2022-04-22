#include <iostream>
#include <string>
using namespace std;
class account
{
private:
    long acc_no;
    string acc_name;
    string acc_type;
    double balance;

public:
    void setdata(long a_no, string a_name, string a_type, double bal)
    {
        acc_no = a_no;
        acc_name = a_name;
        acc_type = a_type;
        balance = bal;
    }
    void displaydata();
    void withdraw();
    void deposite();
    void acc_balance();
};

void account::displaydata()
{
    cout << "\t--------  Account Details  --------\t" << endl;
    cout << "\tAccount Number :\t" << acc_no << endl;
    cout << "\tA/C holder name :\t" << acc_name << endl;
    cout << "\tType OF Account :\t" << acc_type << endl;
    cout << "\t-----------------------------------\t" << endl;
}

void account::deposite()
{
    float temp_amount;
    system("clear");
    cout << "\tEnter the Amount which you want to Deposite in your account :\t";
    cin >> temp_amount;
    balance += temp_amount;

    cout << "\tSuccessful Deposited\t" << endl;
}

void account::withdraw()
{
    float temp_amount;
    system("clear");
    cout << "\tEnter the amount :\t";
    cin >> temp_amount;
    if (temp_amount <= (balance - 500))
    {
        balance -= temp_amount;

        cout << "\tSuccessful Withdraled\t\n";
    }
    else
    {
        cout << "Enter amount which is less then current balance..\t\n"
             << "\tOR\t\n";
        cout << "Minimum balance should be 500 rupees...\t\n";
    }

    cout << "\n";
}

void account::acc_balance()
{
    cout << "Account no : \t" << acc_no << endl;
    cout << "Balance : \t" << balance << endl;
}
int main()
{
    account a;
    a.setdata(123456, "priyank", "saving", 10000);
    char ch;
    do
    {
        int choice;
        system("clear");
        cout << " 1. Account details \n";
        cout << " 2. Deposit Amount \n";
        cout << " 3. Withdraw Amount \n";
        cout << " 4. Know Balance \n";
        cout << " 5. Exit\n";
        cout << "Enter your choice :\t";
        cin >> choice;

        switch (choice)
        {
        case 1:
            a.displaydata();
            break;
        case 2:
            a.deposite();
            break;
        case 3:
            a.withdraw();
            break;
        case 4:
            a.acc_balance();
            break;
        case 5:
            return 0;

        default:
            cout << "\tEnter the vaild Input\t";
            break;
        }
        cout << "Do you want to do another transation (y / n) : ";
        cin >> ch;
    } while (ch == 'y' || ch == 'Y');

    return 0;
}