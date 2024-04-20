import java.util.Scanner;

public class SpecialCharactersCounter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a line of text
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();

        // Count the number of special characters and print them separately
        int specialCharCount = 0;
        StringBuilder specialChars = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                specialChars.append(c).append(" ");
                specialCharCount++;
            }
        }

        // Print the special characters separately
        System.out.println("Special characters in the line: " + specialChars.toString());

        // Print the total number of special characters
        System.out.println("Number of special characters in the line: " + specialCharCount);

        // Close the Scanner
        scanner.close();
    }
}
