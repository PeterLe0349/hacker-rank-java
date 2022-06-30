package Java;


import java.util.Scanner;

public class StringReversePalindrome {
    public static void main(String[] args) {
        //see if reverse string equals original string
        //generate a string backwards using forloop, going backwords
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String rs = "";
        for(int i = s.length()-1; i >= 0; i--){
            rs += s.charAt(i);
        }
        System.out.println((s.equals(rs))? "Yes" : "No");

    }
}
