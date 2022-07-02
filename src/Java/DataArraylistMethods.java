package Java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataArraylistMethods {
    public static void main(String[] args) {
//    ArrayList<Integer> ints = new ArrayList<>();
//    ints.add(3);
//    ints.add(1);
//    ints.add(2);
//    ints.add(9);
//    printElementsofArrayList(ints);
//    changeIndexOfArrayList(ints, 3, 100);
//    printElementsofArrayList(ints);
    int[] inArr = {12,123,1,4};
    printElementsofArrayList(inArr);
    printElementsofArrayList(removeAnIndexInArray(inArr, 1));


//        System.out.println(sumOfIntArrayList(ints));
    }
    //remove an element at index, old fashion using index
    public static int[] removeAnIndexInArray(int[] nums, int indexToRemove){
        int[] copyArr = new int[nums.length-1];
        int j = 0;
        for(int i = 0; i< nums.length; i++){
            if(i != indexToRemove){
                copyArr[j] = nums[i];
                j++;
            }
        }
        return copyArr;
    }


    //print all the elements
    public static void printElementsofArrayList(ArrayList<Integer> ints){
        for(Integer i: ints){
            System.out.printf("%d ", i);
        }
        System.out.print("\n");
    }

    public static void printElementsofArrayList(int[] ints){
        for(int i: ints){
            System.out.printf("%d ", i);
        }
        System.out.print("\n");
    }

    public static int sumOfIntArrayList(ArrayList<Integer> ints){
        int sum = 0;
        for(Integer n: ints){
            sum += n;
        }
        return sum;
    }

    public static ArrayList<Integer> changeIndexOfArrayList(ArrayList<Integer> ints, int index, int newNumber){
        ints.set(index, newNumber);
        return ints;
    }


}
