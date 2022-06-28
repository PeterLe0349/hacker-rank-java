package ProblemSolving;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        // a is initial value, b is number to times by with 2 to ith power, c is how many iterations
        Scanner scanner = new Scanner(System.in);
        //read a line and break it into tokens and use it for a, b, c
        //a is initial value, b is multipled by the 2^ith iteration, c is the amount of series
        // a + 2**i  / nested with c series, add to sum

        int queryCount = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < queryCount; i++){
            String s = scanner.nextLine();
            String[] tokens = s.split(" ");
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            int c = Integer.parseInt(tokens[2]);
            for(int j = 1; j<= c; j++){
                int sum = a;
                for(int k = 0; k < j; k++){
                    sum += Math.pow(2,k)*b;
                }
                System.out.printf("%d ", sum );
            }
            System.out.print("\n");
        }
        scanner.close();
    }
//
//
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//    int N = Integer.parseInt(bufferedReader.readLine().trim());

//    end of class
}
