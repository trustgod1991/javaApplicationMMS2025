import java.util.Scanner;

public class Exercise3_38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();

        int digit1 = number / 1000;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        // Step 1: Add 7 and mod 10
        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;

        // Step 2: Swap 1↔3 and 2↔4
        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        temp = digit2;
        digit2 = digit4;
        digit4 = temp;

        System.out.println("Encrypted number: " +
                digit1 + "" + digit2 + "" + digit3 + "" + digit4);

        input.close();
    }
}