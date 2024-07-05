import java.util.Scanner;

public class sort_list_of_names_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store the names
        String[] names = new String[n];

        // Prompt user to enter the names
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Ask user for sorting order
        System.out.print("Order(A/D): ");
        char order = scanner.nextLine().toUpperCase().charAt(0);

        // Sort the names based on the chosen order
        switch (order) {
            case 'A':
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (compareStrings(names[i], names[j]) > 0) {
                            // Swap names[i] and names[j]
                            String temp = names[i];
                            names[i] = names[j];
                            names[j] = temp;
                        }
                    }
                }
                break;

            case 'D':
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (compareStrings(names[i], names[j]) < 0) {
                            // Swap names[i] and names[j]
                            String temp = names[i];
                            names[i] = names[j];
                            names[j] = temp;
                        }
                    }
                }
                break;

            default:
                System.out.println("Invalid order choice. Please enter 'A' for ascending or 'D' for descending.");
                scanner.close();
                return;
        }

        // Print the sorted array
        System.out.println("The names in " + (order == 'A' ? "ascending" : "descending") + " order are:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }

    // Function to compare two strings without using built-in functions
    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 != char2) {
                return char1 - char2;
            }
        }

        return length1 - length2;
    }
}
