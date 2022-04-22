import java.util.*;

class Skip_string {

    int e_id;
    int salary;
    String emp_name;
    String company_name;

    public void getdata() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the employee Id :-");
        e_id = Sc.nextInt();

        System.out.println("Enter the employee name :- ");
        // emp_name = Sc.next();
        Sc.skip("\\R");
        emp_name = Sc.nextLine();
        
        System.out.println("Enter the salary :-");
        salary = Sc.nextInt();
        Sc.skip("\\R");
        
        System.out.println("Enter the company name :-");
        company_name = Sc.nextLine();
    }

    public void display() {
        System.out.println("Your Id : " + e_id);
        System.out.println("Your name : " + emp_name);
        System.out.println("Your salary : " + salary);
        System.out.println("Your company name : " + company_name);
    }

    public static void main(String[] args) {

        Skip_string s1 = new Skip_string();
        s1.getdata();
        s1.display();

    }
}