import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Date (dd/mm/yyyy): ");
        String inputDate = scanner.nextLine();

        // Splitting the input date by "/"
        String[] dateParts = inputDate.split("/");

        // Extracting the day, month, and year parts from the input date
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        // Checking if the year is a leap year
        int isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 1 : 0;

        // Checking if the date is valid
        int isValidDate = 1;
        if (year < 0 || month < 1 || month > 12 || day < 1) {
            isValidDate = 0;
        } else {
            // Check if day is valid for the given month
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    isValidDate = day <= 31 ? 1 : 0;
                    break;
                case 4, 6, 9, 11:
                    isValidDate = day <= 30 ? 1 : 0;
                    break;
                case 2:
                    // Check for February in leap year
                    isValidDate = isLeapYear == 1 ? (day <= 29 ? 1 : 0) : (day <= 28 ? 1 : 0);
                    break;
                default:
                    isValidDate = 0;
                    break;
            }
        }

        // Print the result
        if (isValidDate == 0) {
            System.out.println("Invalid date!");
        } else if (isLeapYear == 1) {
            System.out.println("Given year is a Leap Year");
        } else {
            System.out.println("Given year is a Non Leap Year");
        }
    }
}
