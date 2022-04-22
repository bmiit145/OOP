// Write a program that define class student, in which put fields like student id,name,semester and marks of minimum 5 subjects, and perform following operations
#include <iostream>
using namespace std;

class student
{
private:
    int stu_id;
    char stu_name[30];
    int sem;
    int mark[5];
    int percent;
    char grade;

public:
    void getdata();
    void cal_percent(float a);
    float cal_total();
    void cal_grade();
    void display_result();
};

void student::getdata()
{
    cout << "Enter the Enrollment number of student :\t";
    cin >> stu_id;
    cout << "Enter the Name of Student :\t";
    cin.getline(stu_name, 30);
    cout << "Enter sem :\t";
    cin >> sem;

    for (int i = 1; i <= 5; i++)
    {
        float temp = 0;
        cout << "Enter the mark of subject  " << i;
        cin >> temp;
        if (temp > 0 && temp < 100)
        {

            cin >> mark[i];
        }
    }
}

float student::cal_total()
{
    float total;

    for (int i = 0; i < 5; i++)
    {
        total += mark[i];
    }

    return total;
}

void student ::cal_percent(float a)
{
    percent = a / 5;
}

void student ::cal_grade()
{

    if (percent >= 70)
    {
    }
    else if (percent >= 60)
    {
        grade = 'B';
    }
    else if (percent >= 50)
    {
        grade = 'C';
    }
    else
    {
        grade = 'D';
    }
}

void student ::display_result()
{

    cout << "------------------------------------------------------------------------------\n";
    cout << "-----------------------------  Student Result  -------------------------------\n";
    cout << "                                                                              \n";
    cout << "                           UKA TARSADIYA UNIVERSITY                           \n";
}

int main()
{

    return 0;
}