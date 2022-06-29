package Java;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        //read an n amount of lines and keep track of it
        //concat each line with a line count number
        //use hasnext to check for more input *hint
        int n = 0;
        String finalString = "";
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        boolean keepGoing = true;
        //make boolean false if input is empty
        if(temp.equals("")){
            keepGoing = false;
        }
        while(keepGoing){
            //concat and print each successful nonempty input
            n++;
            System.out.println(n+ " "+ temp);
            if(in.hasNext()){
                temp = in.nextLine();
            }else {
                keepGoing = false;
            }
        }
        in.close();

    }
}
