/**
 * Created by AHappyTeddyBear on 4/19/2015.
 */
public class BoardAdvanced {
    public int calcNeighbor(int[][] board, int x, int y) {
        int count =0;
        for (int i = -1; i <=1 ; i++)
            for (int j = -1; j <=1 ; j++) {
                if (i != 0 && j != 0) {
                    int xindex = (x + i + board.length) % board.length;
                    int yindex = (y + j + board[0].length) % board[0].length;
                    count += board[xindex][yindex];
                }
            }
        return count;
    }
}
