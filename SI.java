import java.util.Scanner;

public class SI {

    // Function to calculate simple interest
    public static double calculateSimpleInterest(double principal, int years, char seniorCitizen) {
        double rateOfInterest = (seniorCitizen == 'y') ? 0.12 : 0.10;
        return principal * rateOfInterest * years;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Is the customer a senior citizen (y/n): ");
        char seniorCitizen = scanner.next().charAt(0);

        // Validate input and calculate interest
        if (principal <= 0 || years <= 0 || (seniorCitizen != 'y' && seniorCitizen != 'n')) {
            System.out.println("Invalid input!");
        } else {
            // Calculate simple interest
            double interest = calculateSimpleInterest(principal, years, seniorCitizen);

            // Output result
            System.out.println("Interest: " + interest);
        }

        scanner.close();
    }
}
