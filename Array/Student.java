import java.util.Scanner;

public class Students{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[10];

        // Enter marks
        System.out.println("Enter marks of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Display marks
        System.out.println("\nMarks of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + " = " + marks[i]);
        }

        sc.close();
    }
}