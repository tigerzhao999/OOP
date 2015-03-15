import java.util.Scanner;

public class ArraysDay2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 integers");
        int[] ar = new int[10];
        //fills your array
        for (int i = 0; i < 10; i++) {
            ar[i] = scan.nextInt();
        }





        // find the max and min numbers in the array (for loop needed)
        int x = 1;
        int max = 0;
        while( x < 10){
            if(max < ar[x]){
                max = ar[x];
                x++;
            }
            else{
                x++;
            }
        }

        int n = 1;
        int min = 214748360;
        while(n < 10){
            if(min > ar[n]){
                min = ar[n];
                n++;
            }
            else{
                n++;
            }
        }
        System.out.println("min = " + min + "  max = " + max);
        // print out the number of 7's in your array

        int s = 0;
        int sevens = 0;
        while(s < 10){
            if(ar[s] == 7){
                sevens++;
                s++;
            }
            else{
                s++;
            }
        }
        System.out.println("7's = " + sevens);
     //prints out number of numbers bigger than three
        int greaterThan3 = 0;
        int t = 0;

        while(t < 10){
            if(ar[t] > 3){
                greaterThan3++;
                t++;
            }
            else{
                t++;
            }
        }
        System.out.println("Numbers greater than 3 = " + greaterThan3);
    }
}