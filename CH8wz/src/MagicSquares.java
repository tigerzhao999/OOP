
public class MagicSquares {
    int ints[][] = {
            {16,3,2,13},
            {5,10,11,8},
            {9,6,7,12},
            {4,15,14,1}
    };

    int diagUp() {
        int sum = 0;
        int length = ints[0].length;
        for (int i = 0; i < length; i++) {
            sum = sum + ints[length-i - 1][i];
        }
        return sum;
    }

    int diagDown() {
        int sum = 0;
        for (int i = 0; i < ints[0].length; i++) {
            sum = sum + ints[i][i];
        }
        return sum;
    }

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
    public boolean isMagic() {
        int target = diagDown();
        if (diagDown() != diagUp()) {
            return false;
        }
        int length = ints[0].length;
        for (int i = 0; i < length; i++){
            if (target != colSum(i) || (target != rowSum(i))){
                return false;
            }
        }
        return true;
    }




    public static void main (String[]args){
        MagicSquares ms = new MagicSquares();
        System.out.println(ms.rowSum(1));
        System.out.println(ms.colSum(0));
        System.out.println(ms.diagDown());
        System.out.println(ms.diagUp());
        if(ms.isMagic()){
            System.out.println("It is a magic square");
        }
        else{
            System.out.println("It is NOT AT ALL a magic square");
        }



    }


}
