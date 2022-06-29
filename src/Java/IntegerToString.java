package Java;

import java.util.Scanner;

public class IntegerToString {

    public static void main(String[] args) {
        //convert an integer to string
        //if successful print Good job
        //if fails print Wrong answer
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        try{
            String s = String.valueOf(n);
            System.out.println("Good job");
        }catch(Exception e){
            System.out.println("Wrong answer");
        }
    }
}
