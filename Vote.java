import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age >= 18) {
           System.out.println("You are allowed to vote");
        } else {
            int yearsLeft = 18 - age;
            System.out.println("You are allowed to vote after " + yearsLeft + " years");
        }

        scanner.close();
    }
}
