package Java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CompilePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0; i < n; i++){
            try{
                String s = in.nextLine();
                Pattern p = Pattern.compile(s);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
        }
    }
}
