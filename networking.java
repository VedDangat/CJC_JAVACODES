import java.util.Scanner;

public class networking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] code = new int[8];      // Transmitted Code (Index 1 to 7)
        int[] received = new int[8];  // Received Code

        // ================= TRANSMITTER SIDE =================
        System.out.println("========== TRANSMITTER SIDE ==========");
        System.out.println("Enter 4 Data Bits:");

        code[3] = sc.nextInt();
        code[5] = sc.nextInt();
        code[6] = sc.nextInt();
        code[7] = sc.nextInt();

        // Calculate parity bits
        code[1] = code[3] ^ code[5] ^ code[7];
        code[2] = code[3] ^ code[6] ^ code[7];
        code[4] = code[5] ^ code[6] ^ code[7];

        System.out.print("\nGenerated 7-bit Hamming Code: ");
        for (int i = 1; i <= 7; i++) {
            System.out.print(code[i] + " ");
        }
        System.out.println();

        // ================= RECEIVER SIDE =================
        System.out.println("\n========== RECEIVER SIDE ==========");
        System.out.println("Enter the Received 7-bit Hamming Code:");

        for (int i = 1; i <= 7; i++) {
            received[i] = sc.nextInt();
        }

        System.out.print("\nReceived Code: ");
        for (int i = 1; i <= 7; i++) {
            System.out.print(received[i] + " ");
        }
        System.out.println();

        // Calculate syndrome bits
        int s1 = received[1] ^ received[3] ^ received[5] ^ received[7];
        int s2 = received[2] ^ received[3] ^ received[6] ^ received[7];
        int s4 = received[4] ^ received[5] ^ received[6] ^ received[7];

        int errorPosition = s1 + (s2 * 2) + (s4 * 4);

        if (errorPosition == 0) {
            System.out.println("\nNo Error Detected.");
        } else {
            System.out.println("\nError Detected at Position: " + errorPosition);

            if (received[errorPosition] == 0) {
                received[errorPosition] = 1;
            } else {
                received[errorPosition] = 0;
            }

            System.out.println("Error Corrected Successfully.");
        }

        // ================= FINAL OUTPUT =================
        System.out.println("\n========== FINAL RESULT ==========");

        System.out.print("Original Transmitted Code : ");
        for (int i = 1; i <= 7; i++) {
            System.out.print(code[i] + " ");
        }
        System.out.println();

        System.out.print("Final Corrected Code      : ");
        for (int i = 1; i <= 7; i++) {
            System.out.print(received[i] + " ");
        }
        System.out.println();

        System.out.print("Original Data Sent        : ");
        System.out.print(code[3] + " ");
        System.out.print(code[5] + " ");
        System.out.print(code[6] + " ");
        System.out.print(code[7]);
        System.out.println();

        System.out.print("Final Data Received       : ");
        System.out.print(received[3] + " ");
        System.out.print(received[5] + " ");
        System.out.print(received[6] + " ");
        System.out.print(received[7]);
        System.out.println();

        sc.close();
    }
}