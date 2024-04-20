import java.util.Arrays;
import java.util.Scanner;

public class Mean_median_mode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calculate Mean
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double meanValue = (double) sum / n;

        // Calculate Median
        Arrays.sort(arr);
        double medianValue;
        if (n % 2 == 0) {
            medianValue = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            medianValue = arr[n / 2];
        }

        // Calculate Mode
        int mode = arr[0];
        int maxFreq = 1;
        int currentFreq = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentFreq++;
            } else {
                currentFreq = 1;
            }

            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                mode = arr[i];
            }
        }

        System.out.println("Mean = " + meanValue);
        System.out.println("Median = " + medianValue);
        System.out.println("Mode = " + mode);
    }
}
