import java.util.*;

class Test{
    int a;

    Test(){
        // a = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a :");
        a = sc.nextInt();

        // a =x ;
       
    }


    
    public void putdata(){
        System.out.println("a : " + a);
    }
}


class Demo_3 {
    public static void main(String args[]){
        Test b = new Test();
        Test c = new Test();
        b.putdata();
        c.putdata();
        
    }  
}
