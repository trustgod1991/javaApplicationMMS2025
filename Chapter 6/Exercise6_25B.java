public class Exercise6_25B {

    static int[] queens = new int[8];

    public static void main(String[] args) {
        placeQueen(0);
        printBoard();
    }

    public static boolean placeQueen(int col) {

        if(col == 8)
            return true;

        for(int row = 0; row < 8; row++) {

            queens[col] = row;

            if(isValid(col)) {
                if(placeQueen(col + 1))
                    return true;
            }
        }

        return false;
    }

    public static boolean isValid(int col) {

        for(int i = 0; i < col; i++) {

            if(queens[i] == queens[col])
                return false;

            if(Math.abs(queens[i] - queens[col]) == Math.abs(i - col))
                return false;
        }

        return true;
    }

    public static void printBoard() {

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {

                if(queens[j] == i)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }
}