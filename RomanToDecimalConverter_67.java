import java.util.Scanner;

public class RomanToDecimalConverter_67 {

    // Function to return value of a Roman numeral character
    public static int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1; // Handling invalid characters
        }
    }

    // Function to convert Roman numeral to decimal number
    public static int romanToDecimal(String str) {
        int res = 0;
        // Traverse the Roman numeral string from left to right
        for (int i = 0; i < str.length(); i++) {
            // Get the value of the current Roman numeral character
            int s1 = value(str.charAt(i));

            // Check if there is a next character in the string
            if (i + 1 < str.length()) {
                // Get the value of the next Roman numeral character
                int s2 = value(str.charAt(i + 1));

                // Compare values of current and next characters
                if (s1 >= s2) {
                    // If current value is greater or equal to next value, add current value to result
                    res += s1;
                } else {
                    // If current value is less than next value, subtract current value from result (as per Roman numeral rules)
                    res += s2 - s1;
                    i++; // Skip next character since it's already processed
                }
            } else {
                // If there is no next character, simply add the value of the current character to result
                res += s1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = input.next();

        // Convert Roman numeral to decimal and print the result
        int decimalValue = romanToDecimal(romanNumeral);
        System.out.println("Decimal value: " + decimalValue);

        input.close();
    }
}
