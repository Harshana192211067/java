import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("Case 1: Check if a string is palindrome");
        System.out.println("Case 2: Check if a number is palindrome");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.println("Enter the string:");
                String str = scanner.nextLine();
                int left = 0;
                int right = str.length() - 1;
                boolean isStringPalindrome = true;

                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        isStringPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isStringPalindrome)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not a Palindrome");
                break;
            case 2:
                System.out.println("Enter the number:");
                int num = scanner.nextInt();
                int originalNum = num;
                int reversedNum = 0;

                while (num > 0) {
                    int digit = num % 10;
                    reversedNum = reversedNum * 10 + digit;
                    num /= 10;
                }

                if (originalNum == reversedNum)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not a Palindrome");
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
