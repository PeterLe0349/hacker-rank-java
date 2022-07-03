package Java;

public class FibnoNacci {
    public static void main(String[] args) {
        fibonaci(9);

    }

    public static void fibonaci(int n){
        int a = 0;
        int b = 0;
        int c = 1;
        for(int i = 0; i < n; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }

    }
}
