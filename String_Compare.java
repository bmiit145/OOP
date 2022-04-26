/*

import java.util.*;


class Test1{
	String a;
	String b;
	Test1(){
		a = "abc";
	}

	void getdata(){
		Scanner sc = new Scanner(System.in);
		b = sc.next();
	}

	void cal(){
		
			if(a.equalsIgnoreCase(b)){
				System.out.println("Successfully");
			}else{
				System.out.println(" Not Successfully");
				
			}
		
	}
}

class Test{
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.getdata();
		t.cal();
	}
}
--------------------------------------------------------------------------------------

*/

import java.util.*;


class Test1{

	String a;
	String b;

	Test1(){
		a = "abc";
	}

	void getdata(){
		Scanner sc = new Scanner(System.in);
		b = sc.nextLine();
	}

	void cal(){
	

		//find length

		int len1 = a.length();
		int len2 = b.length();

	

		// transfer to char array

		char arr_a[] = a.toCharArray();

		char arr_b[] = b.toCharArray();

		if (len1 == len2) {
			for (int i = 0; i < len1 ; i++) {
				if(arr_a[i] == arr_b[i]){
				}else{
					System.out.println(" Not Successfully");
					return;
				}
			}
					System.out.println("Successfully");
		}else{
			System.out.println(" Not Successfully ,, length differ");
		}
		
			
		
	}
}

class String_Compare{
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.getdata();
		t.cal();
	}
}

