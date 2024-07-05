import java.util.Scanner;

public class RemoveDuplicatesAndPrintCommon_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array a
        System.out.print("Enter the size of array a: ");
        int sizeA = sc.nextInt();
        int a[] = new int[sizeA];
        System.out.println("Enter elements of array a:");
        for (int i = 0; i < sizeA; i++) {
            a[i] = sc.nextInt();
        }

        // Input array b
        System.out.print("Enter the size of array b: ");
        int sizeB = sc.nextInt();
        int b[] = new int[sizeB];
        System.out.println("Enter elements of array b:");
        for (int i = 0; i < sizeB; i++) {
            b[i] = sc.nextInt();
        }

        // Remove duplicates from array b
        int len = sizeB;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (b[i] == b[j]) {
                    // Shift elements to the left to overwrite the duplicate
                    for (int k = j; k < len - 1; k++) {
                        b[k] = b[k + 1];
                    }
                    j--;  // Decrement j to check the new element at position j
                    len--;  // Decrease the length of the array
                }
            }
        }

        // Print common elements between array a and the deduplicated array b
        System.out.print("Common elements: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < len; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }

        sc.close();
    }
}
