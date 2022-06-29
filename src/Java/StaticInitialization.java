package Java;

import java.util.Scanner;

public class StaticInitialization {
    //static initialization , create statics that are similar to constructor, make it protected and final
    //to avoid having it modified outside of instance

    static int b, h;
    static {
        try {
            initializeVariables();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {

        //calculate area of parallelogram  b*h
        //if number is less than 0 , throw exception    java.lang.Exception: Breadth and height must be positive
    }

    protected static void initializeVariables() throws Exception {
        Scanner in = new Scanner(System.in);
        b = Integer.parseInt(in.nextLine());
        h = Integer.parseInt(in.nextLine());
        in.close();
        if( b> 0 && h >0) {
            System.out.println(b*h);
        }else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }





}
