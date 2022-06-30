package Java;

public class ValidUserNameRegex {
    public static void main(String[] args) {
//        String s = "Samantha?10_2A";
//        System.out.println(Character.isLetter(s.charAt(0)));
//        System.out.println(s.charAt(1) == 'a');
//        System.out.println(Character.isLetter(s.charAt(1)));
        isValid("8");
        isValid("Julia");
        isValid("Samantha?10_2A");

        isValid("Julia@007");
        isValid("_Julia007");
    }

    public static void isValid(String s){
        boolean validInput = false;
        for(int i = 0; i <s.length(); i++){
            validInput = false;
            if(Character.isLetter(s.charAt(i))){
                validInput = true;
            }
            if(Character.isDigit(s.charAt(i))){
                validInput = true;
            }
            if(s.charAt(i) == '_'){
                validInput = true;
            }
            if(validInput == false){
                break;
            }
        }
        if(!Character.isLetter(s.charAt(0)) || s.length() < 8 || s.length() > 30){
            validInput = false;
        }
        if(validInput){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }

    }
}
