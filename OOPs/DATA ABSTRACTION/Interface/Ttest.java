import java.util.Scanner;

public class Ttest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SBI sb = new SBI();
        BOM bm = new BOM();

        do {

            System.out.println("\n1. SBI");
            System.out.println("2. BOM");
            System.out.println("3. Exit");

            System.out.println("Enter your choice:");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("======SBI SELECTED======");

                    sb.Createacc();
                    sb.Deposit();
                    sb.Withdraw();
                    sb.Checkbalance();
		    sb.Display();

                    break;

                case 2:
                    System.out.println("======BOM SELECTED======");

                    bm.Createacc();
                    bm.Deposit();
                    bm.Withdraw();
                    bm.Checkbalance();
		    bm.Display();

                    break;

                case 3:
                    System.out.println("====Program ended.====");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (true);
    }
}