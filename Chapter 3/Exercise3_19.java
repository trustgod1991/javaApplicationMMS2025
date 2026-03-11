import java.util.Scanner;

public class Exercise3_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;  // gross sales
        int item;

        System.out.print("Enter item number sold (1-4) or -1 to quit: ");
        item = input.nextInt();

        while (item != -1) {

            if (item == 1)
                totalSales += 239.99;
            else if (item == 2)
                totalSales += 129.75;
            else if (item == 3)
                totalSales += 99.95;
            else if (item == 4)
                totalSales += 350.89;
            else
                System.out.println("Invalid item number");

            System.out.print("Enter item number sold (1-4) or -1 to quit: ");
            item = input.nextInt();
        }

        // Calculate earnings
        double earnings = 200 + (0.09 * totalSales);

        System.out.printf("Gross sales: $%.2f%n", totalSales);
        System.out.printf("Earnings: $%.2f%n", earnings);

        input.close();
    }
}