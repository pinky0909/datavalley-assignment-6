import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the input string to lowercase for case-insensitive comparison
        inputString = inputString.toLowerCase();

        // Initialize variables to count vowels and check if any vowel is present
        int vowelCount = 0;
        boolean isVowelPresent = false;

        // Define array of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Iterate through each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a vowel
            for (char vowel : vowels) {
                if (ch == vowel) {
                    isVowelPresent = true;
                    vowelCount++;
                    break;
                }
            }
        }

        // Display the result
        if (isVowelPresent) {
            System.out.println("Yes, vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }

        scanner.close();
    }
}
