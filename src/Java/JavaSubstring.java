package Java;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        //first line gives a string
        //second line gives a substring start and end
        //print out the substring of line one based on parameters of second line
        //char hierarchy A < z
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] subNums = in.nextLine().split(" ");
        System.out.println(s.substring(Integer.parseInt(subNums[0]), Integer.parseInt(subNums[1])));


    }
}
