import java.util.Scanner;

public class Exercise6_29A {

    public static int fibonacci(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Fibonacci number: " + fibonacci(n));
    }
		//The largest Fibonacci number that fits in a Java int is:
		//F(46) = 1836311903
}