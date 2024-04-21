import java.util.Scanner;

public class MultiplicationTable_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input m and n
        System.out.println("Enter the value of m:");
        int m = scanner.nextInt();
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();

        // Ensure n is positive
        if (n <= 0) {
            System.out.println("Invalid input for n. Please enter a positive integer.");
        } else {
            // Print the multiplication table of m up to n
            for (int i = m; i <= n; i++) {
                System.out.println(i + "x" + m + "=" + (i * m));
            }
        }

    }
}
