import java.util.Scanner;

public class FibonacciEvenSum_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        
        int sum = 0;
        int a = 0, b = 1;
        
        for (int i = 0; i <= 2 * n; i++) {
            if (i % 2 == 0) {
                sum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        
        System.out.println("Sum of numbers at even indexes = " + sum);
    }
}
