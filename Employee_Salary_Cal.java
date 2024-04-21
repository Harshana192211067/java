import java.util.Scanner;

public class Employee_Salary_Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input grade of the employee
        System.out.println("Enter the grade of the employee:");
        char grade = scanner.nextLine().charAt(0);

        // Input salary of the employee
        System.out.println("Enter the employee salary:");
        double salary = scanner.nextDouble();

        double bonus = 0;

        // Calculate bonus based on grade
        if (grade == 'A') {
            bonus = salary * 0.05; // 5% bonus for grade A workers
        } else if (grade == 'B') {
            bonus = salary * 0.10; // 10% bonus for grade B workers
        } else {
            System.out.println("Invalid grade entered. No bonus calculated.");
        }

        // Check if the salary is less than $10,000 and apply extra 2% bonus if true
        if (salary < 10000) {
            bonus += salary * 0.02;
        }

        double totalSalary = salary + bonus;

        // Output salary and bonus information
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total to be paid: " + totalSalary);

        scanner.close();
    }
}
