package Java;

public class isItPrime {

    public static void main(String[] args) {
        int n;
        n = 30;
        int divisorCount = 0;
        if (n <= 3) {
            System.out.println("Less than or is 3, it's a prime");
        } else {
            for (int i = 2; i < n; i++) {
                if(n%i ==0) divisorCount++;
            }
        }
        if(divisorCount==0){
            System.out.println("Prime");
            System.out.println(divisorCount);
        }else{
            System.out.println("Not a prime");
            System.out.println(divisorCount);
        }

    }




}
