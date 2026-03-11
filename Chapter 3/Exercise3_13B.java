//Sum of an Arbitrary Number of Positive Integers
//Appropriate Type:

//Sentinel-controlled repetition

//Because:

//We don’t know how many numbers the user will enter.

//The loop must continue until the user decides to stop.

//We usually use a sentinel value (like -1 or 0) to signal stop.

import java.util.Scanner;

public class Exercise3_13B {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int number;

		System.out.print("Enter a positive integer (-1 to stop): ");
		number = input.nextInt();

		while (number != -1) {
			sum += number;
			System.out.print("Enter a positive integer (-1 to stop): ");
			number = input.nextInt();
		}

		System.out.println("Sum = " + sum);
	}
}