public class Exercise6_24 {

    static int[][] board = new int[8][8];

    public static boolean placeQueen(int col)
    {
        if(col >= 8)
            return true;

        for(int row=0; row<8; row++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = 1;

                if(placeQueen(col+1))
                    return true;

                board[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] board,int row,int col)
    {
        for(int i=0;i<col;i++)
            if(board[row][i]==1)
                return false;

        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
            if(board[i][j]==1)
                return false;

        for(int i=row,j=col;i<8 && j>=0;i++,j--)
            if(board[i][j]==1)
                return false;

        return true;
    }

    public static void main(String[] args)
    {
        placeQueen(0);

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
}