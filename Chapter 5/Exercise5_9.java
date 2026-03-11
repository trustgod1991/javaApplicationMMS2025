import java.util.Scanner;

public class Exercise5_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double x = input.nextDouble();

        double y = Math.floor(x + 0.5);

        System.out.println("Original: " + x);
        System.out.println("Rounded: " + y);
    }
}