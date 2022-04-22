import java.util.Scanner;

class Account {
    String acc_holder_name;
    String acc_type;
    long acc_num;
    long acc_balance;

    Account() {
    }

    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("\t----------\tAccount Holder Info\t----------\t");
        System.out.print("Account Holder Name :\t");
        acc_holder_name = sc.nextLine();
        System.out.print("Account number :-\t");
        acc_num = sc.nextLong();
        int temp;
        inner: do {
            System.out.println("1 . Saving Account");
            System.out.println("2 . Current Account\n");
            System.out.print("Enter Account Type :-\t");
            temp = sc.nextInt();

            if (temp == 1) {
                acc_type = "saving";
            } else if (temp == 2) {
                acc_type = "Current";
            } else {
                System.out.println("Incorrect Input");
            }
        } while (temp != 1 && temp != 2);

        System.out.print("Enter the Account balance :-\t");
        acc_balance = sc.nextLong();
    }

    void withdraw() {
        long with_amt;
        for (int i = 0;; i++) {
            //take a amount
            System.out.println("Enter The Withdrawal Amount :\t");
            with_amt = sc.nextLong();
            // stored in temp
            long with_temp = acc_balance - with_amt;
            // check conditions
            if (with_amt > 0) {
                if (with_temp > 0) {
                    acc_balance = with_temp;
                    System.out.println("\tSuccessfully Withdrawal\n");
                }else{
                    System.err.println("\n\tYou are not allowed to withdraw");
                    System.err.println("\n\t Check Account Balance\n");
                }
                break;
            } else {
                System.err.println("\n\tEnter the correct Amount\t\n");
            }
        }
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
    void minimumBalance() {
        if (acc_balance < 10000) {
            System.out.println("\n\tYour pananlty for Low Balance is :\t1550");
            acc_balance += 1550;
        }
    }
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