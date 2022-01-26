import java.util.Scanner;

class BankDetails {
    private String accno;
    private String name;
    private String acc_type;
    private long balance;

    Scanner sc = new Scanner(System.in);

    //method to open new account
    public void openAccount() {
        System.out.print("Enter account number:");
        accno = sc.next();
        System.out.print("Enter Account Type");
        acc_type = sc.next();
        System.out.print("Enter Name");
        name = sc.next();
        System.out.print("Enter Balance");
        balance = sc.nextLong();
    }

    //method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance is: " + balance);
    }
}

public class BankingApp {
}
