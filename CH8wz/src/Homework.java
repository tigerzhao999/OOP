
public class Homework {
    //8.8

    public static void main(String[] args) {
        double random[] = new double[10];
        for (int i = 0; i < 10; i++) {
            random[i] = (100 * Math.random());
        }
        for (int i = 0; i <= 9; i++) {
            System.out.println(random[i]);
        }

    }
    //8.9 is not going to get the first term in the array. an array of 10 doesn't
    // have a 10th term it should be either <= 9 or < 10

    public static void hwA8_11() {
        int[] data = new int[10];
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
    }

    public static boolean hwB8_11(double[] data, double target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void hwC8_11(double[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }

    public static void hwA8_12(double[] data) {
        double sum = 0;
        for (double x : data) {
            sum = sum + x;
        }
    }

    public static void hwB8_12(double[] data) {
        double sum = 0 - data[0];
        for (double x : data) {
            sum = (sum + x);
        }
    }

    public static double hwC8_12(double[] data, double target) {
        double i = 0;
        for (double x : data) {
            if (x == target) {
                return i;
            }
            i++;
        }
        return 0;
    }

}


