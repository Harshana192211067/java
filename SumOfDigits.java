import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N value
        System.out.print("Enter N value: ");
        int n = scanner.nextInt();

        // Input N-digit number
        System.out.print("Enter " + n + " digit number: ");
        int number = scanner.nextInt();

        // Calculate sum of digits
        int sum = 0;
        while (number > 0 || sum > 9) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10;
            number /= 10;
        }

        // Print result
        System.out.println("Sum of " + n + " digit number: " + sum);

        scanner.close();
    }
}
