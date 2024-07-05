import java.util.Scanner;

public class reverseandaddunitl_palindrome_63 {
    public static int revnum(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static boolean check(int num) {
        int rev = revnum(num);
        return num == rev;
    }

    public static void add(int num) {
        if (check(num)) {
            System.out.println("Palindrome");
        } else {
            while (!check(num)) {
                int rev = revnum(num);
                int sum = num + rev;
                System.out.println(num + "+" + rev + "=" + sum);
                num = sum;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        add(num);
        input.close();
    }
}
