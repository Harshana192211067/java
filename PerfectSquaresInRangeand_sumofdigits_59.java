import java.util.Scanner;

public class PerfectSquaresInRangeand_sumofdigits_59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the range
        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        // Check if the range is valid
        if (lowerRange > upperRange) {
            System.out.println("Invalid range. Lower range should be less than or equal to upper range.");
        } else {
            // Find all perfect squares in the given range
            System.out.print("[");
            boolean first = true;
            for (int i = lowerRange; i <= upperRange; i++) {
                if (isPerfectSquare(i) && sumOfDigits(i) < 10) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    first = false;
                }
            }
            System.out.println("]");
        }

        scanner.close();
    }

    // Function to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    // Function to calculate the sum of the digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
