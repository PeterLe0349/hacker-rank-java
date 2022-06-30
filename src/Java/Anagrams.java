package Java;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {
    private static HashMap<Character, Integer> lettersCounts = new HashMap<>();
    private static HashMap<Character, Integer> lettersCounts2 = new HashMap<>();

    public static void main(String[] args) {
        //check if string a and b are anagrams
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().toLowerCase();
        String b = in.nextLine().toLowerCase();
        //check if lengths are same first, skip if not

        for(int i = 0; i < a.length(); i++){
            //loop through letters and create hashmap of letter counts, each key is one letter/ignore case
            char c = a.charAt(i);
            //check if it has char, if it does add +1 to value, else create newhashmap and value at 1
            if(lettersCounts.containsKey(c)){
                lettersCounts.put(c, lettersCounts.get(c)+1);
            }else{
                lettersCounts.put(c, 1);
            }
        }
        for(int i = 0; i < b.length(); i++){
            //loop through letters and create hashmap of letter counts, each key is one letter/ignore case
            char c = b.charAt(i);
            //check if it has char, if it does add +1 to value, else create newhashmap and value at 1
            if(lettersCounts2.containsKey(c)){
                lettersCounts2.put(c, lettersCounts2.get(c)+1);
            }else{
                lettersCounts2.put(c, 1);
            }
        }
        //create a boolean for comparison if it's anagram.
        //true say Anagrams
        //false say Not Anagrams
        //iterate through keyset of one hashamp, if other doesn't have key, can immediatley make false
        //if values do not match, break and make false
        boolean isAnagram = true;
        if(a.length() == b.length()){
            for(char c : lettersCounts.keySet()) {
                if (lettersCounts2.containsKey(c)) {
                    if (!lettersCounts.get(c).equals(lettersCounts2.get(c))) {
                        isAnagram = false;
                        break;
                    }
                } else {
                    isAnagram = false;
                    break;
                }
            }
        }else{isAnagram=false;}

        if(isAnagram){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }



    }
}
