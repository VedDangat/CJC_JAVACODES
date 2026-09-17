import java.util.Scanner;

public class T {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for division=");
        int num = sc.nextInt();

        System.out.println("=================");

        // ArithmeticException
        try {
            int result = 10 / num;
            System.out.println("The answer is=" + result);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("=================");

        // ArrayIndexOutOfBoundsException
        try {
            int arr[] = {1, 2, 3, 4, 5, 6};
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("=================");

        // NullPointerException
        try {
            String name = null;
            int len = name.length();
            System.out.println(len);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("=================");

        // NumberFormatException
        try {
            String rollno = "one";
            int i = Integer.parseInt(rollno);
            System.out.println(i);
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("=================");

        System.out.println("Entire code is completed");

        sc.close();
    }
}