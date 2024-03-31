import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for largest, smallest, total sum, and count of numbers entered
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int totalSum = 0;
        int count = 0;

        // Flag to determine if the user wants to continue entering numbers
        boolean continueEntering = true;

        // Input numbers until the user wants to stop
        while (continueEntering) {
            System.out.print("Enter a number (enter '0' to stop): ");
            int number = scanner.nextInt();

            // Check if the entered number is zero to stop entering numbers
            if (number == 0) {
                continueEntering = false;
            } else {
                // Update largest and smallest numbers
                largest = Math.max(largest, number);
                smallest = Math.min(smallest, number);

                // Add the entered number to the total sum
                totalSum += number;

                // Increment the count of numbers entered
                count++;
            }
        }

        // Calculate the average of all the numbers entered
        double average = (double) totalSum / count;

        // Display the largest, smallest, and average numbers
        System.out.println("Largest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);
        System.out.println("Average of all the numbers entered: " + average);

        scanner.close();
    }
}
