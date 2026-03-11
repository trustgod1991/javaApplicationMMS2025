import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise3_39 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter annual growth rate (percent): ");
        double growthRate = input.nextDouble();

        growthRate = growthRate / 100.0;  // convert percentage to decimal

        double initialPopulation = population;
        double doubledPopulation = population * 2;

        System.out.printf("%-6s %-18s %-18s%n", "Year", "Population", "Increase");

        int yearDoubleReached = -1;

        for (int year = 1; year <= 75; year++) {

            double increase = population * growthRate;
            population = population + increase;

            // Formatting for readability
            System.out.printf("%-6d %-18.0f %-18.0f%n", year, population, increase);

            // Check if doubled
            if (yearDoubleReached == -1 && population >= doubledPopulation) {
                yearDoubleReached = year;
            }
        }

        if (yearDoubleReached != -1) {
            System.out.println("\nPopulation would double by year: " + yearDoubleReached);
        } else {
            System.out.println("\nPopulation would NOT double within 75 years.");
        }

        input.close();
    }
}