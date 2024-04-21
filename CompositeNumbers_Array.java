import java.util.Scanner;

public class CompositeNumbers_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (num > 1) {
                boolean isComposite = false;
                for (int j = 2; j * j <= num; j++) {
                    if (num % j == 0) {
                        isComposite = true;
                        break;
                    }
                }
                if (isComposite)
                    count++;
            }
        }
        
        System.out.println("Number of Composite Numbers = " + count);
        
    }
}
