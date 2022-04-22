import java.util.Scanner;

class Account {
    String acc_holder_name;
    String acc_type;
    long acc_num;

    void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t----------\tAccount Holder Info\t----------\t");
        System.out.println("Account Holder Name :\t");
        acc_holder_name = sc.nextLine();
        System.out.println("Account number :-\t");
        acc_num = sc.nextLong();
        int temp;
        inner: do {
            System.out.println("1 . Saving Account");
            System.out.println("2 . Current Account");
            System.out.println("Enter Account Type :-\t");
            temp = sc.nextInt();

            if (temp == 1) {
                acc_type = "saving";
            } else if (temp == 2) {
                acc_type = "Current";
            } else {
                System.out.println("Incorrect Input");
            }
        } while (temp != 1 && temp != 2);
    }
}

/**
 * SavingsAccount
 */

class SavingsAccount extends Account {

    void interest() {

    }
}

/**
 * CurrentAccount
 */
class CurrentAccount extends Account {

}

/**
 * Con_Account
 */
public class Con_Account {
    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount();
        SavingsAccount s = new SavingsAccount();
    }
}