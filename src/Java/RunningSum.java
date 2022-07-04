package Java;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {3,1, 4,5};
        runningS(arr);

    }

    public static void runningS(int[] arr){
        for(int i = 0 ; i< arr.length; i++){
            int sum = 0;
            for(int j= 0; j<=i; j++){
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }
}
