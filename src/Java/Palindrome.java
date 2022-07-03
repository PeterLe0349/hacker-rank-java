package Java;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isItPalindrome("abb3a"));

    }

    public static boolean isItPalindrome(String s){
        boolean pali = false;
        char[] chars = s.toCharArray();
        String paliString = "";
        for(int i = s.length()-1; i >= 0; i--){
            paliString += chars[i];
        }
        System.out.println(s);
        System.out.println(paliString);
        if(s.equals(paliString)) pali = true;
        return pali;
    }
}
