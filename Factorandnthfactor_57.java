import java.util.Scanner;

public class Factorandnthfactor_57{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the given number
        System.out.print("Given Number: ");
        int number = scanner.nextInt();
        
        // Input the value of N
        System.out.print("N = ");
        int N = scanner.nextInt();
        
        if (number == 0) {
            System.out.println("Number of factors = 1");
            System.out.println("Nth factor of 0 = 0");
            return;
        }
        
        int factorsCount = 0;
        int nthFactor = -1;
        
        for (int i = 1; i <= Math.abs(number); i++) {
            if (number % i == 0) {
                factorsCount++;
                if (factorsCount == N) {
                    nthFactor = i;
                    break;
                }
            }
        }
        
        System.out.println("Number of factors = " + factorsCount);
        System.out.println("Nth factor of " + number + " = " + nthFactor);
    }
}
