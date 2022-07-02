package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class ArraysDS {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(3);
        ints.add(6);
        ints.add(10);
        List<Integer> ints2 = reverseArray(ints);
        for(Integer i: ints){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for(Integer i: ints2){
            System.out.print(i + " ");
        }

    }


    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> reverseList = new ArrayList<Integer>();
        //iterate each string token and save into array as int
        for(int i = a.size()-1; i>=0; i--){
            reverseList.add(a.get(i));
        }
        return reverseList;


    }
}
