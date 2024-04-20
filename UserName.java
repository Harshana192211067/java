import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the user name: ");
        String userName1 = scanner.nextLine();

        System.out.print("Reenter the user name: ");
        String userName2 = scanner.nextLine();

        if (userName1.equals(userName2)) {
            System.out.println("User name is Valid");
        } else {
            System.out.println("User name is Invalid");
        }

        scanner.close();
    }
}
