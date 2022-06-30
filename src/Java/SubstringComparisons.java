package Java;

import java.util.Scanner;

public class SubstringComparisons {
    public static void main(String[] args) {
        //given a string s and substring length k
        //find the smallest and largest substring
        //welcomejava 3 >   ava wel
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = Integer.parseInt(in.nextLine());
        getSmallestAndLargest(s,k);
    }

    public static void getSmallestAndLargest (String s, int k){
        //store a smallest and largest length of 3 string
        //do a for loop to interate substrings of length 3, limit at substring length -3
        String small = s.substring(0,k);
        String large = s.substring(0,k);
        for(int i = 0; i <= s.length()-k; i++){
            //if the small is lexically larger than the substring, switch small to new substring
            if(small.compareTo(s.substring(i, i+k)) > 0){
                small = s.substring(i, i+k);
            }
            //if the large is smaller than the sub, switch large to new substring
            if(large.compareTo(s.substring(i, i+k)) < 0){
                large = s.substring(i, i+k);
            }
        }
        System.out.println(small);
        System.out.println(large);

    }
}
