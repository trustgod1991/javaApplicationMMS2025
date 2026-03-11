//Initialize counter to 1
//Input first number
//Set largest to first number
//Set secondLargest to first number

//While counter < 10
    //Input number
    
    //If number > largest
        //secondLargest = largest
        //largest = number
    //Else if number > secondLargest
        //secondLargest = number
    
    //Increment counter

//Print largest
//Print secondLargest

import java.util.Scanner;

public class Exercise3_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;

        System.out.print("Enter number 1: ");
        number = input.nextInt();

        int largest = number;
        int secondLargest = number;

        while (counter < 10) {
            System.out.print("Enter number " + (counter + 1) + ": ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } 
            else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.println("Largest number is: " + largest);
        System.out.println("Second largest number is: " + secondLargest);

        input.close();
    }
}