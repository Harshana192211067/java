import java.util.Scanner;

public class ArmstrongNumber_without_builtinfn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int numDigits = 0;
        int temp = number;

        // Count number of digits in the number
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }

        int sum = 0;
        temp = number;

        // Calculate sum of digits raised to the power of the number of digits
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < numDigits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
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
