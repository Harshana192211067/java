import java.util.Arrays;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1};

        // Sort the array to group identical elements together
        Arrays.sort(array);

        // Initialize variables to keep track of the current element and its frequency
        int currentElement = array[0];
        int frequency = 1;

        // Print the header of the table
        System.out.println("Element | Frequency");
        System.out.println("--------------------------");

        // Iterate through the array to count the frequency of each element
        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentElement) {
                frequency++;
            } else {
                // Print the frequency of the previous element
                System.out.printf("%-8d| %8d%n", currentElement, frequency);
                
                // Update current element and reset frequency
                currentElement = array[i];
                frequency = 1;
            }
        }

        // Print the frequency of the last element
        System.out.printf("%-8d| %8d%n", currentElement, frequency);
    }
}
