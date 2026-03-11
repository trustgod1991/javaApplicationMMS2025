import java.util.Scanner;

public class Exercise3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;          // miles driven for a trip
        int gallons;        // gallons used for a trip
        int totalMiles = 0; // cumulative miles
        int totalGallons = 0; // cumulative gallons

        System.out.println("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();  // first input

        while (miles != -1) {  // sentinel-controlled loop
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            // Calculate and display miles per gallon for this trip
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            // Update totals
            totalMiles += miles;
            totalGallons += gallons;

            // Display cumulative miles per gallon
            double totalMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon so far: %.2f%n%n", totalMpg);

            // Prompt for next trip
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        System.out.println("Thank you for using the Gas Mileage Calculator!");
        input.close();
    }
}