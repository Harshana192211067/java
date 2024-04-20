import java.util.Scanner;

public class LCM_GCD {

    // Function to calculate GCD of two numbers
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM of two numbers
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // Function to calculate GCD of n numbers
    public static int findGCDOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = findGCD(result, arr[i]);
        }
        return result;
    }

    // Function to calculate LCM of n numbers
    public static int findLCMOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = findLCM(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Initialize the array
        int[] numbers = new int[n];
        
        // Get the elements of the array from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate GCD and LCM
        int gcd = findGCDOfArray(numbers);
        int lcm = findLCMOfArray(numbers);

        // Output results
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
