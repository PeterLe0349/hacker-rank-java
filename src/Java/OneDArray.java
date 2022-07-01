package Java;

import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        int[] arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(in.nextLine());
        }
        for(int n: arr){
            System.out.println(n);
        }


    }
}
