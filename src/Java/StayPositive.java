package Java;

public class StayPositive {
    public static void main(String[] args) {
        boolean minWorks = false;
        long startNum = 0;
        long sum = 0;
        int[] ints = {-4,4,-4, 5};
        //the sum must always be >= 1
        while(minWorks == false){
            sum = startNum;
            for(int i = 0; i< ints.length; i++){
                sum += ints[i];
                if(sum >= 1){
                    minWorks = true;
                }else {
                    startNum++;
                    break; // increase start num by 1 and break
                }
            }
        }
        System.out.println(startNum);
        System.out.println(findMinPostiive(ints));
    }

    public static long findMinPostiive(int[] arr){
        long minNum = 0;
        long sum = 0;
        for(int i: arr){
            sum += i;
            if(sum < minNum){
                minNum = sum;
            }
        }
        return 1-minNum;
    }


}
