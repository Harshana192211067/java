import java.util.Scanner;

public class DecimalToBinaryOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input decimal number
        System.out.println("Enter a decimal number:");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary
        StringBuilder binaryNumber = new StringBuilder();
        int temp = decimalNumber;
        while (temp > 0) {
            int remainder = temp % 2;
            binaryNumber.insert(0, remainder); // Insert the remainder at the beginning
            temp /= 2;
        }

        // Convert decimal to octal
        StringBuilder octalNumber = new StringBuilder();
        temp = decimalNumber;
        while (temp > 0) {
            int remainder = temp % 8;
            octalNumber.insert(0, remainder); // Insert the remainder at the beginning
            temp /= 8;
        }

        // Output binary and octal representations
        System.out.println("Binary equivalent: " + binaryNumber);
        System.out.println("Octal equivalent: " + octalNumber);

        scanner.close();
    }
}
