package Java;

import java.util.Scanner;

public class JavaDataTypes {
    //Testing if input can be a byte, short, int and long

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first message should say if integer can be fitted or not
        //determine first message using boolean expression
        //concat the byte,short, int, and long if it can be fitted

        boolean canFit = false;   //determine which initial message to display
        String fitMessage = "";   //concat all the datatype that can be fitted;
        String num;
        int howMany = Integer.parseInt(scanner.nextLine());
        //iterate the amount of expected input, if it passes try, change fit to true and concat this datatype can be fitted;
        for(int i = 0; i < howMany; i++){
            canFit = false;
            fitMessage = "";
            num = scanner.nextLine();
            try{
                Byte.parseByte(num);
                fitMessage= fitMessage.concat("* byte\n");
                canFit = true;
            }catch(NumberFormatException e){
                //do nothing
            }
            try{
                Short.parseShort(num);
                fitMessage= fitMessage.concat("* short\n");
                canFit = true;
            }catch(NumberFormatException e){
                //do nothing
            }
            try{
                Integer.parseInt(num);
                fitMessage= fitMessage.concat("* int\n");
                canFit = true;
            }catch(NumberFormatException e){
                //do nothing
            }
            try{
                Long.parseLong(num);
                fitMessage= fitMessage.concat("* long\n");
                canFit = true;
            }catch(NumberFormatException e){
                //do nothing
            }
            //final concat with initial fit message then datatypes
            if(canFit){
                System.out.println(num + " can be fitted in:");
                System.out.print(fitMessage);
            }else {
                System.out.println(num + " can't be fitted anywhere.");
            }
        }



    }
}
