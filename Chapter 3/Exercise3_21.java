//Pseudocode
//Set counter to 1
//Prompt user to enter first number
//Input number
//Set largest to number

//While counter is less than 10
    //Prompt user to enter next number
    //Input number

    //If number is greater than largest
        //Set largest to number

    //Increase counter by 1

//Print largest

import java.util.Scanner;

public class Exercise3_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;

        // Input first number
        System.out.print("Enter number 1: ");
        number = input.nextInt();
        largest = number;   // initialize largest

        // Process remaining 9 numbers
        while (counter < 10) {

            System.out.print("Enter number " + (counter + 1) + ": ");
            number = input.nextInt();

            if (number > largest)
                largest = number;

            counter++;
        }

        System.out.println("Largest number is: " + largest);

        input.close();
    }
}