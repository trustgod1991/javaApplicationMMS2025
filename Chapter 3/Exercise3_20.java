import java.util.Scanner;

public class Exercise3_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;

        while (count <= 3) {  // Process three employees

            System.out.println("Employee " + count);

            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double grossPay;

            if (hours <= 40)
                grossPay = hours * rate;   // No overtime
            else
                grossPay = (40 * rate) + ((hours - 40) * rate * 1.5);

            System.out.printf("Gross pay: $%.2f%n%n", grossPay);

            count++;
        }

        input.close();
    }
}