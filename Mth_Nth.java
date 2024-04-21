import java.util.Arrays;
import java.util.Scanner;

public class Mth_Nth {
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

        // Input M
        System.out.println("Enter the value of M:");
        int M = scanner.nextInt();

        // Input N
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();

        // Sort the array in ascending order
        Arrays.sort(array);

        // Find the Mth maximum number
        int mthMax = array[array.length - M];

        // Find the Nth minimum number
        int nthMin = array[N - 1];

        // Calculate the sum and difference
        int sum = mthMax + nthMin;
        int diff = mthMax - nthMin;

        // Output the results
        System.out.println("1st Maximum Number = " + mthMax);
        System.out.println("3rd Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);

        scanner.close();
    }
}
