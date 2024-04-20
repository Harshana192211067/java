import java.util.Scanner;

public class Vowel_consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String vowels = "";
        String consonants = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels += ch;
            } else if (Character.isLetter(ch)) { // Check if the character is a consonant
                consonants += ch;
            }
        }

        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
    }
}
