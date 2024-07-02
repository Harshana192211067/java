import java.util.Scanner;

class PrimeChecker implements Runnable {
    private final int number;

    public PrimeChecker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number <= 1) {
            System.out.println(number + " is not Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is Prime");
            } else {
                System.out.println(number + " is not Prime");
            }
        }
    }
}

public class PrimeCheckThread_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            PrimeChecker primeChecker = new PrimeChecker(number);
            Thread thread = new Thread(primeChecker);
            thread.start();
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
