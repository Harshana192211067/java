import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double number = scanner.nextDouble();

        double square = number * number;
        double cube = number * number * number;

        System.out.println("Square of the number: " + square);
        System.out.println("Cube of the number: " + cube);
    }
}
