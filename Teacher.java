/* 
    teacher name , id , age , gender , inst name ,   

*/


class Teacher {
    String T_name;
    String Ins_name;
    int id;
    int age;
    char gen;
    int exp;

    public void setdata( String name,String I_name ,int t_id, int t_age , char gender ,int t_exp){
        T_name = name;
        Ins_name = I_name ;
        id = t_id;
        age = t_age;
        gen = gender;
        exp = t_exp;
           
    }
    public void displaydata(){
        System.out.println("Teacher name :: " + T_name);
        System.out.println("Teacher Id :: " + id);
        System.out.println("Teacher age :: " + age );
        System.out.println("Institute name :: " + Ins_name );
        System.out.println("Experience :: " + exp);
        if (gen == 'm' || gen == 'M'){
            System.out.println("Gender :: Male ");
        }else{
            System.out.println("GEnder :: Female " );
        } 
        
    }

    public static void main(String args[]){
        Teacher t1 = new Teacher ();
        t1.setdata("Bhumika" , "Bmiit" , 102 , 18 , 'f' , 10);
        t1.displaydata();
        Teacher t2 = new Teacher();

        
    }
}
