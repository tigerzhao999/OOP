
public class StartRules {

    public static void main(String[] args) {

        //create board

        int[][] board= new int[30][40];

        //fill it - 0=dead, 1=alive

        for (int i = 0; i<board.length; i ++){

            for (int j = 0; j<board[0].length;j++){

                board[i][j] = 1;

            }

        }


        printBoard(board);



        int[][] next_board = new int[30][40];

        //copy the contents from one board to another

        //now cloning 2D matrices...shallow copy

        for (int i = 0; i<board.length; i ++){

            for (int j = 0; j<board[0].length;j++){

                next_board[i][j] = board[i][j];

            }

        }

        //check the neighbors of all cells, then determine rules

        int neighbors = 0;

        for (int i = 0; i<board.length; i ++){

            for (int j = 0; j<board[0].length;j++){
                neighbors = calc(board, i, j);
                //Any live cell with fewer than two live neighbours dies, as if caused by under-population.
                if((board[i][j] > 0) && (neighbors < 2)){
                    //dead
                    next_board[i][j] = 0;
                }
                //Any live cell with two or three live neighbours lives on to the next generation.
                if((board[i][j] > 0) && ((neighbors == 2)||(neighbors == 3))){
                    //lives on
                    next_board[i][j] = 1;
                }
                //Any live cell with more than three live neighbours dies, as if by overcrowding.
                if((board[i][j] > 0) && (neighbors > 3)){
                    //rip
                    next_board[i][j] = 0;
                }
                //Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
                if((board[i][j] == 0) && (neighbors == 3)){
                    //revive
                    next_board[i][j] = 1;
                }


            }

        }

        System.out.println("Check that the rules worked");

        printBoard(next_board);

    }



    public static int calc (int[][] board, int x, int y){

        int myX = x;
        int myY = y;
        int aliveNeighbors = 0;

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
        return(aliveNeighbors);
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