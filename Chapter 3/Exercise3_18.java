import java.util.Scanner;

public class Exercise3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;

        System.out.print("Enter account number (or -1 to quit): ");
        accountNumber = input.nextInt(); // sentinel value to end input

        while (accountNumber != -1) {
            // Input customer information
            System.out.print("Enter beginning balance: ");
            beginningBalance = input.nextInt();

            System.out.print("Enter total charges this month: ");
            charges = input.nextInt();

            System.out.print("Enter total credits applied this month: ");
            credits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            creditLimit = input.nextInt();

            // Calculate new balance
            newBalance = beginningBalance + charges - credits;

            // Display new balance
            System.out.println("New balance: " + newBalance);

            // Check if credit limit is exceeded
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println(); // blank line for readability

            // Prompt for next customer
            System.out.print("Enter account number (or -1 to quit): ");
            accountNumber = input.nextInt();
        }

        System.out.println("All customers processed. Thank you!");
        input.close();
    }
}