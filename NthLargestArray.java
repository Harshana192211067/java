import java.util.Arrays;
import java.util.Scanner;

public class NthLargestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements
        System.out.println("Enter the number of elements:");
        int numElements = scanner.nextInt();
        int[] array = new int[numElements];

        // Input array elements
        System.out.println("Enter the elements of the array separated by spaces:");
        for (int i = 0; i < numElements; i++) {
            array[i] = scanner.nextInt();
        }

        

        // Input N
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();

        // Sort the array in ascending order
        Arrays.sort(array);

        // Find the Nth maximum number
        int nthMax = array[array.length - N];

       

        // Output the results
        System.out.println("Maximum Number = " + nthMax);
    }
}
