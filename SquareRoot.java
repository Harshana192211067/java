import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        // Calculate square root
        int sqrt = findSquareRoot(number);

        // Check if the number is a perfect square
        if (sqrt * sqrt == number) {
            System.out.println("Square Root: " + sqrt + ", " + (-1 * sqrt));
        } else {
            System.out.println("The number is not a perfect square.");
        }

        scanner.close();
    }

    // Function to find the square root of a perfect square number
    public static int findSquareRoot(int num) {
        int sqrt = 1;
        while (sqrt * sqrt <= num) {
            sqrt++;
        }
        return sqrt - 1;
    }
}
