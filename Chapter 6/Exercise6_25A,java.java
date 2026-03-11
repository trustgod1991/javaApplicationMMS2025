import java.util.Random;

public class Exercise6_25A {

    static Random rand = new Random();

    public static void main(String[] args) {

        int[] queens = new int[8];

        while(true) {

            // place queens randomly
            for(int i = 0; i < 8; i++)
                queens[i] = rand.nextInt(8);

            if(isValid(queens))
                break;
        }

        printBoard(queens);
    }

    public static boolean isValid(int[] q) {

        for(int i = 0; i < 8; i++) {
            for(int j = i + 1; j < 8; j++) {

                // same row
                if(q[i] == q[j])
                    return false;

                // diagonal attack
                if(Math.abs(q[i] - q[j]) == Math.abs(i - j))
                    return false;
            }
        }
        return true;
    }

    public static void printBoard(int[] q) {

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {

                if(q[j] == i)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }
}