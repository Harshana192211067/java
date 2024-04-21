import java.util.Scanner;

public class AveragePositiveNegative_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int positiveSum = 0;
        int negativeSum = 0;

        // Input numbers until -1 is encountered
        System.out.println("Enter numbers (-1 to exit):");
        int num = scanner.nextInt();

        while (num != -1) {
            if (num >= 0) {
                positiveSum += num;
                positiveCount++;
            } else {
                negativeSum += num;
                negativeCount++;
            }
            num = scanner.nextInt();
        }

        // Calculate averages
        double avgPositive = positiveCount == 0 ? 0 : (double) positiveSum / positiveCount;
        double avgNegative = negativeCount == 0 ? 0 : (double) negativeSum / negativeCount;

        // Output average of positive and negative numbers
        System.out.println("The average of negative numbers is: " + avgNegative);
        System.out.println("The average of positive numbers is: " + avgPositive);

        scanner.close();
    }
}
