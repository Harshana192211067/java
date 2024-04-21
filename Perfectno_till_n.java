import java.util.Scanner;
public class Perfectno_till_n{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
int n= scanner.nextInt();

int i,j;
 if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            System.out.print("First " + n + " perfect numbers are: ");
            int count = 0;
            int num = 1;

            while (count < n) {
                int sum = 0;
                for (i = 1; i <= num / 2; i++) {
                    if (num % i == 0) {
                        sum += i;
                    }
                }
                if (sum == num) {
                    System.out.print(num + " ");
                    count++;
                }
                num++;
            }
        }



}
}