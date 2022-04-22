class Demo_2 {
    int a;
    public void getdata(){
        a = 10;
    }
    public void displaydata(){
        System.out.println("a : " + a);
    }
    public static void main(String[] args) {
        Demo_2 b = new Demo_2();
        b.getdata();
        b.displaydata();
    }    
}
