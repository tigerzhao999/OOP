public class Fibo {

    public static void fibo(int[] arr) {
        if (arr.length == 0){
            return;
        }
        if (arr.length == 1){
            arr[0] = 1;
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 || i == 1){
                arr[i] = 1;
            }
            else{
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
    }
    public static void main(String[] args){
        int[] nums = new int[37];
        fibo(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

