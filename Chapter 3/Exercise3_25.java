public class Exercise3_25 {
    public static void main(String[] args) {

        for (int row = 1; row <= 8; row++) {

            // If row is even, start with a space
            if (row % 2 == 0) {
                System.out.print(" ");
            }

            // Print 8 stars in each row
            for (int column = 1; column <= 8; column++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}