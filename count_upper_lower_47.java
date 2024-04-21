import java.util.Scanner;

public class count_upper_lower_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;

        // Input characters until * is encountered
        System.out.println("Enter characters (* to exit):");
        char ch = scanner.next().charAt(0);

        while (ch != '*') {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
            ch = scanner.next().charAt(0);
        }

        // Output counts of uppercase, lowercase, and numbers
        System.out.println("Total count of lowercase: " + lowercaseCount);
        System.out.println("Total count of uppercase: " + uppercaseCount);
        System.out.println("Total count of numbers: " + numberCount);

        scanner.close();
    }
}
