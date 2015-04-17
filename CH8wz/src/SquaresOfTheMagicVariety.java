/**
 * Created by AHappyTeddyBear on 4/2/2015.
 */
public class SquaresOfTheMagicVariety {

    public static void main(String[] args){
        int test[][] = {
                {16,3,2,13},
                {5,10,11,8},
                {9,6,7,12},
                {4,15,14,1}
        };


        // Nothing wrong with this sample 3x3 array,
        // but isMagicSquare needs to work for ANY
        // nxn array
        print2DArray(test);
        System.out.println(isMagicSquare(test));

            }

    public boolean isMagicSquare(int[][] arr) {
        int sum = 0;
        for (int column = 0; column < arr.length; column++) {
            sum += arr[0][column];  // Add up elements of row 0
        }
        return (rowsOK(arr, sum) && colsOK(arr, sum) && diagsOK(arr, sum) && correctElements(arr));
    }

    public boolean rowsOK(int[][] arr, int tN) {
        boolean same = true;
        int sum = 0;

        //write nested loops to check each column's sum
        //if the sum is not the same as tN, set same to false.
        for(int i = 0; i < arr[0].length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                sum = sum + arr[i][j];
            }
        }
        if(sum == tN)
            same = true;
        else
            same = false;

        return same;
    }

    public  boolean colsOK(int[][] arr, int tN) {
        boolean same = true;
        int sum = 0;

        //write nested loops to check each column's sum
        //if the sum is not the same as tN, set same to false.
        for(int i = 0; i < arr[0].length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                sum = sum + arr[j][i];
            }
        }
        if(sum == tN)
            same = true;
        else
            same = false;

        return same;
    }

    public boolean diagsOK(int[][] arr, int tN){
        int diagleftsum = 0;
        int diagrightsum = 0;
        for(int i = 0; i < arr[0].length; i++)
        {
            diagleftsum = diagleftsum + arr[i][(arr.length-1) - i];
            diagrightsum = diagrightsum + arr[i][i];
        }
        if(diagleftsum != tN || diagrightsum != tN)
            return false;
        diagleftsum = 0;
        diagrightsum = 0;
        return true;
    }

    public boolean correctElements(int[][] arr) {
        {
            int numcheck = 1;
            boolean tofind = false;
            while (numcheck < arr.length*arr.length)
            {
                for(int i = 0; i < arr.length; i++)
                    for(int j = 0; j < arr.length; j++)
                    {
                        if(arr[i][j] == numcheck)
                        {
                            tofind = true;
                        }
                    }
                numcheck++;
            }
            if(tofind == false)
                return false;
            else
                return true;
        }
        // Verify that the numbers from 1 to n^2 are all in the array
    }

    // Print utility for a 2-dimensional array of ints
    public void print2DArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}