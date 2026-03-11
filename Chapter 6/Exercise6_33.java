import java.util.Scanner;

public class Exercise6_33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] topics = {
                "Climate Change",
                "Education",
                "Healthcare",
                "Poverty Reduction",
                "Cybersecurity"
        };

        int[][] responses = new int[5][10];

        char choice;

        do {

            for (int i = 0; i < topics.length; i++) {

                int rating;

                do {
                    System.out.print("Rate the importance of " + topics[i] + " (1-10): ");
                    rating = input.nextInt();

                } while (rating < 1 || rating > 10);

                responses[i][rating - 1]++;
            }

            System.out.print("Is there another person who wants to respond? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');


        System.out.println("\nSurvey Results\n");

        System.out.printf("%-20s", "Topic");

        for (int i = 1; i <= 10; i++)
            System.out.printf("%4d", i);

        System.out.printf("%10s\n", "Average");


        int highestTotal = Integer.MIN_VALUE;
        int lowestTotal = Integer.MAX_VALUE;
        String highestTopic = "";
        String lowestTopic = "";


        for (int i = 0; i < topics.length; i++) {

            System.out.printf("%-20s", topics[i]);

            int totalPoints = 0;
            int totalResponses = 0;

            for (int j = 0; j < 10; j++) {

                System.out.printf("%4d", responses[i][j]);

                totalPoints += responses[i][j] * (j + 1);
                totalResponses += responses[i][j];
            }

            double average = (totalResponses == 0) ? 0 : (double) totalPoints / totalResponses;

            System.out.printf("%10.2f\n", average);


            if (totalPoints > highestTotal) {
                highestTotal = totalPoints;
                highestTopic = topics[i];
            }

            if (totalPoints < lowestTotal) {
                lowestTotal = totalPoints;
                lowestTopic = topics[i];
            }
        }


        System.out.println("\nHighest point total: " + highestTopic + " (" + highestTotal + ")");
        System.out.println("Lowest point total: " + lowestTopic + " (" + lowestTotal + ")");
    }
}