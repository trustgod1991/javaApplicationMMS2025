import java.util.Scanner;

public class Exercise3_38B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter encrypted four-digit integer: ");
        int number = input.nextInt();

        int digit1 = number / 1000;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        // Step 1: Swap back
        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        temp = digit2;
        digit2 = digit4;
        digit4 = temp;

        // Step 2: Reverse (add 3 mod 10)
        digit1 = (digit1 + 3) % 10;
        digit2 = (digit2 + 3) % 10;
        digit3 = (digit3 + 3) % 10;
        digit4 = (digit4 + 3) % 10;

        System.out.println("Decrypted number: " +
                digit1 + "" + digit2 + "" + digit3 + "" + digit4);

        input.close();
    }
}