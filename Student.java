import java.util.*;

class Student {

    public static void main(String[] args) {
    Info s = new Info();
    s.getData();
    s.display();
    }
}

class Info {
    int R_no;
    String sname;
    String lname;
    int sem;
    float m1, m2, m3, m4, m5;
    int temp;
    // void checkMark(int x);
    public  void getData() {
        Scanner Sc = new Scanner(System.in);
       /* System.out.println("Enter the Roll number : ");
        R_no = Sc.nextInt();
        System.out.println("Enter the surname : ");
        sname = Sc.next();
        System.out.println("Enter the last name : ");
        lname = Sc.nextLine();
        System.out.println("Enter Semester : ");
        sem = Sc.nextInt();*/
        System.out.println("Enter the marks of subject 1 : ");
        int x1 = Sc.nextInt();
        checkMark(x1);
        m1 = temp;

        // System.out.println("Enter the marks of subject 2 : ");
        // int x2 = Sc.nextInt();
        // m2 = checkMark(x1);
        // System.out.println("Enter the marks of subject 3 : ");
        // int x3 = Sc.nextInt();
        // checkMark(x1);
        // System.out.println("Enter the marks of subject 4 : ");
        // int x4 = Sc.nextInt();
        // checkMark(x1);
        // System.out.println("Enter the marks of subject 5 : ");
        // int x5 = Sc.nextInt();
        // checkMark(x1);
        
    }



    public  void checkMark(int x){
        if (x >= 0 && x <= 100 ) {
            // return x;
            temp = x;
        } else {
            System.err.println("Enter vaild mark for each subject");
            // return 0;
        }
    }

    public void display(){
        System.out.println("the marks of subject 1 : " + m1);
    }

}
