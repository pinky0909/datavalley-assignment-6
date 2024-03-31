import java.util.Scanner;

public class TotalExpensesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input quantity and price per item
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Calculate total expenses
        double totalExpenses = quantity * pricePerItem;

        // Apply discount if applicable
        double discount = 0;
        if (quantity > 50) {
            discount = 0.10 * totalExpenses; // 10% discount for quantity > 50
        } else if (quantity >= 25 && quantity <= 50) {
            discount = 0.05 * totalExpenses; // 5% discount for quantity between 25 and 50 (inclusive)
        }

        // Calculate final amount after discount
        double finalAmount = totalExpenses - discount;

        // Display total expenses and final amount
        System.out.println("Total expenses before discount: Rs. " + totalExpenses);
        System.out.println("Discount applied: Rs. " + discount);
        System.out.println("Final amount after discount: Rs. " + finalAmount);

        scanner.close();
    }
}
