package Java;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        in.close();
        System.out.println(a.length() + b.length());
        System.out.println((a.compareTo(b) > 0) ? "Yes": "No");
        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1) + " " + b.substring(0,1).toUpperCase() + b.substring(1) );

    }
}
