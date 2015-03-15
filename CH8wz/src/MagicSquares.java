
public class MagicSquares {
    int ints[][] = {
            {1, 2, 3, 4, 5},
            {200, 3, 4, 5, 1999},
            {3, 4, 5, 1, 2},
            {4, 5, 1, 2, 3},
            {5, 1, 2, 3, 4}
    };

    int rowSum(int row) {
        int sum1 = 0;
        for (int i = 0; i < ints[row].length; i++) {
            sum1 = sum1 + ints[row][i];
        }
        return sum1;
    }
    int colSum(int col) {
        int sum = 0;
        for (int i = 0; i < ints[col].length; i++) {
            //assume square matrix
            sum = sum + ints[i][col];
        }
        return sum;
    }

    public static void main (String[]args){
        MagicSquares ms = new MagicSquares();
        System.out.println(ms.rowSum(1));
        System.out.println(ms.colSum(0));


    }


}
