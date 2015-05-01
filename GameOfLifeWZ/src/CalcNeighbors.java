public class CalcNeighbors {


    public static void main(String[] args) {
        //create board
        int[][] board= new int[5][5];
        //fill it - 0=dead, 1=alive
        for (int i = 0; i<board.length; i ++){
            for (int j = 0; j<board[0].length;j++){
                board[i][j] = 0;
            }
        }
        board[1][2]=1;
        board[0][2]=1;
        board[1][1]=1;

        calc(board);
        System.out.println(board.length);
    }



    public static void calc (int[][] board){
        //pick a position to determine the neighbors around it
        int myX = 4;
        int myY = 0;
        board[4][1] = 1;
        int aliveNeighbors = 0;
        printBoard(board);

        if((myX - 1 >= 0) && (myY - 1 >=0) && (myX - 1 < board.length) && (myY - 1 < board[0].length)) {
            aliveNeighbors = aliveNeighbors + board [myX - 1] [myY - 1];
        }
        //1

        if((myX - 1 >= 0) && (myY >= 0) && (myX - 1 < board.length) && (myY < board[0].length)) {
            aliveNeighbors = aliveNeighbors + board [myX - 1] [myY];
        }
        //2
        if((myX - 1 >= 0) && (myY + 1 >=0) && (myX - 1 < board.length) && (myY + 1 < board[0].length)) {
            aliveNeighbors = aliveNeighbors + board [myX - 1] [myY + 1];
        }
        //3
        if((myX >= 0) && (myY - 1 >=0) && (myX < board.length) && (myY - 1 < board[0].length)) {
            aliveNeighbors = aliveNeighbors + board [myX] [myY - 1];
        }
        //4
        if((myX >= 0) && (myY + 1 >=0) && (myX < board.length) && (myY + 1 < board[0].length)) {
            aliveNeighbors = aliveNeighbors + board [myX] [myY + 1];
        }
        //5
        if((myX + 1 >= 0) && (myY - 1 >=0) && (myX + 1 < board.length) && (myY - 1 < board[0].length)) {
            aliveNeighbors = aliveNeighbors + board [myX + 1] [myY - 1];
        }
        //6
        if((myX + 1 >= 0) && (myY >=0) && (myX + 1 < board.length) && (myY < board[0].length)) {
            aliveNeighbors = aliveNeighbors + board [myX + 1] [myY];
        }
        //7
        if((myX + 1 >= 0) && (myY + 1 >=0) && (myX + 1 < board.length) && (myY + 1 < board[0].length)) {
            aliveNeighbors = aliveNeighbors + board [myX + 1] [myY + 1];
        }
        //8
        System.out.println(aliveNeighbors);
    }
    public static void printBoard (int[][] board){
        for (int i = 0; i<board.length; i ++){
            for (int j = 0; j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();

        }
    }

}