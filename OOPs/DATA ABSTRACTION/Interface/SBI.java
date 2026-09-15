import java.util.Scanner;

public class SBI implements RBI {

    Scanner sc = new Scanner(System.in);

    int no;
    float amt;
    float balance = 0;
    float amtt;

    public void Createacc() {
        System.out.println("Enter the account number:");
        no = sc.nextInt();

        System.out.println("Account created successfully.");
    }

    public void Deposit() {
        System.out.println("Enter the amount to deposit:");
        amt = sc.nextFloat();

        balance = balance + amt;

        System.out.println("Amount deposited successfully.");
    }

    public void Withdraw() {
        System.out.println("Enter the amount to withdraw:");
        amtt = sc.nextFloat();

        if (amtt <= balance) {
            balance = balance - amtt;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void Checkbalance() {
        System.out.println("Your balance is: " + balance);
    }

    public void Display(){
	System.out.println("==========================");
	System.out.println("Bank Account No.=" +no);
	System.out.println("Bank Balance=" +balance);
	System.out.println("Bank Deposit Amount=" +amt);
	System.out.println("Bank Withdraw Amount=" +amtt);
	System.out.println("Final Balance=" +balance);
    }


}