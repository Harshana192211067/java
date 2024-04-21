import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        // Calculate sum of digits raised to the power of the number of digits
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        
        // Check if the number is Armstrong
        if (sum == originalNumber) {
            System.out.println("Given number is Armstrong number");
        } else {
            System.out.println("Given number is not Armstrong number");
        }
        
        scanner.close();
    }
}
