import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days late
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        // Calculate fine
        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.50; // 50 paise per day
        } else if (daysLate >= 8 && daysLate <= 14) {
            fine = (7 * 0.50) + ((daysLate - 7) * 1); // 50 paise for first 7 days, 1 rupee per day after
        } else if (daysLate > 14 && daysLate <= 21) {
            fine = (7 * 0.50) + (7 * 1) + ((daysLate - 14) * 5); // 50 paise for first 7 days, 1 rupee for next 7 days, 5 rupees per day after
        } else {
            System.out.println("Your membership has been canceled for returning the book after 21 days.");
            scanner.close();
            return;
        }

        // Display fine
        System.out.println("Fine amount: Rs. " + fine);

        scanner.close();
    }
}
