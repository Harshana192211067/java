import java.util.Scanner;

public class Error_sumofno_53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements (N): ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Check if more numbers are entered than N
        if (scanner.hasNext()) {
            System.out.println("More numbers entered than specified. Ignoring extra inputs.");
                   }
        
        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        
        System.out.println("Sum of the numbers: " + sum);
    }
}
