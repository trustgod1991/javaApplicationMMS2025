import java.util.Random;

public class Exercise6_28 {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        int tortoise = 1;
        int hare = 1;

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (tortoise < 70 && hare < 70) {

            int i = random.nextInt(10) + 1;

            // Tortoise movement
            if (i >= 1 && i <= 5)
                tortoise += 3;        // Fast plod
            else if (i >= 6 && i <= 7)
                tortoise -= 6;        // Slip
            else
                tortoise += 1;        // Slow plod

            // Hare movement
            int j = random.nextInt(10) + 1;

            if (j >= 1 && j <= 2)
                hare += 0;           // Sleep
            else if (j >= 3 && j <= 4)
                hare += 9;           // Big hop
            else if (j == 5)
                hare -= 12;          // Big slip
            else if (j >= 6 && j <= 8)
                hare += 1;           // Small hop
            else
                hare -= 2;           // Small slip


            if (tortoise < 1)
                tortoise = 1;

            if (hare < 1)
                hare = 1;


            for (int k = 1; k <= 70; k++) {

                if (k == tortoise && k == hare)
                    System.out.print("OUCH!!!");

                else if (k == tortoise)
                    System.out.print("T");

                else if (k == hare)
                    System.out.print("H");

                else
                    System.out.print(" ");
            }

            System.out.println();

            Thread.sleep(1000);
        }


        if (tortoise >= 70 && hare >= 70)
            System.out.println("It's a tie.");

        else if (tortoise >= 70)
            System.out.println("TORTOISE WINS!!! YAY!!!");

        else
            System.out.println("Hare wins. Yuch.");
    }
}