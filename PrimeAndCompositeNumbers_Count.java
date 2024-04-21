import java.util.Scanner;

public class PrimeAndCompositeNumbers_Count{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.println("Enter the numbers (enter -1 to stop):");
        int num;
        int primeCount = 0;
        int compositeCount = 0;

        while ((num = scanner.nextInt()) != -1) {
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }

        // Print the count of prime and composite numbers
        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);

        scanner.close();
    }
}
