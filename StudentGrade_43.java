import java.util.Scanner;

public class StudentGrade_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks in four subjects
        System.out.println("Enter the marks in Python:");
        double pythonMarks = scanner.nextDouble();
        System.out.println("Enter the marks in C Programming:");
        double cMarks = scanner.nextDouble();
        System.out.println("Enter the marks in Mathematics:");
        double mathMarks = scanner.nextDouble();
        System.out.println("Enter the marks in Physics:");
        double physicsMarks = scanner.nextDouble();

        // Calculate total marks
        double totalMarks = pythonMarks + cMarks + mathMarks + physicsMarks;

        // Calculate aggregate
        double aggregate = totalMarks / 4;

        // Display total and aggregate marks
        System.out.println("Total = " + totalMarks);
        System.out.println("Aggregate = " + aggregate);

        // Determine grade based on aggregate
        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }

        scanner.close();
    }
}
