import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String args[]) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the matrices
        System.out.print("Enter the size of the matrices (n): ");
        int n = scanner.nextInt();

        // Prompt the user to enter the elements of matrix a
        System.out.println("Enter the elements of matrix a (" + n + "x" + n + "):");
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Prompt the user to enter the elements of matrix b
        System.out.println("Enter the elements of matrix b (" + n + "x" + n + "):");
        int b[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // Create another matrix to store the multiplication result
        int c[][] = new int[n][n];

        // Perform matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // Close the Scanner
        scanner.close();
    }
}
