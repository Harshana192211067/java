import java.util.Scanner;

public class Number_to_YWD_55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        
        if (days < 0) {
            System.out.println("Number of days cannot be negative.");
            return;
        }
        
        int years = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        remainingDays = remainingDays % 7;
        
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + remainingDays);
    }
}
