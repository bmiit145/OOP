import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Char_count {
    int length;
    String s;
    char arr[];
    char temp[];

    Char_count() {

    }

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :");
        s = sc.next();
    }

    void calculate() {
        arr = new char[s.length()];
        temp = new char[s.length()];
        // System.out.println(s[2]);
        // arr = s.keyset();

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = 0; j < i; j++) {
        //        if(arr[i] == arr[j]){
        //             break;
        //        } 
        //        if (i == j) {
        //            System.out.println(arr[i]);
        //        }
        //     }
        // }
        System.out.println(temp);
    }
}

public class StringChar {
    public static void main(String[] args) {
        Char_count d = new Char_count();
        d.getdata();
        d.calculate();
    }
}
