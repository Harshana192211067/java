import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBalance = 0;

        // Input denominations and number of notes
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the " + (i + 1) + " Denomination:");
            int denomination = scanner.nextInt();
            System.out.println("Enter the " + (i + 1) + " Denomination number of notes:");
            int numNotes = scanner.nextInt();

            totalBalance += denomination * numNotes;
        }

        // Output total available balance
        System.out.println("Total Available Balance in ATM: " + totalBalance);

        scanner.close();
    }
}
