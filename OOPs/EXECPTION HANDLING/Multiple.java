import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // System.out.println("Enter the number:-");
       // int num = sc.nextInt();

        try {
            int arr[] = {10, 20, 30, 40};

            int result = 30 / 0;

            System.out.println(arr[10]);
            System.out.println(result);
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("CODE EXECUTED AND ENDED");
        }
    }
}