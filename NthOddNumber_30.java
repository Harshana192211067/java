import java.util.Scanner;

public class NthOddNumber_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n >= 0) {
                int nthOdd = 2 * n - 1; // nth odd number
                int nthOddAfterNOddNumbers = nthOdd + 2 * n;
                System.out.println(n + "th odd number after " + n + " odd numbers = " + nthOddAfterNOddNumbers);
            } else {
                System.out.println("N must be a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input. N must be an integer.");
        }
    }
}
