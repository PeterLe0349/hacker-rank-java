package Java;

public class DataStringMethods {
    public static void main(String[] args) {
//        String[] names = {"Peter", "Pedro", "Pierre", "Leslie"};
//        for(String n: names){
//            System.out.println(leetCode(n));
//        }
//        String a = "hello";
//        String b = "earth";
//        String c = combineTwoStrings(a,b);
//        System.out.println(c);
//        System.out.println("hello world");
//        String s = "Hello World";
//        char[] chars = makeStringToCharArray(s);
//        for(char c: chars){
//            System.out.println(c);
//        }
        String a = "hello world";
//        System.out.println(a);
//        System.out.println(reverseString(a));
        System.out.println(a.substring(1, 3));
        System.out.println(a.substring(3));
    }



    //reverse the string
    public static String reverseString(String s){
        String bucket = "";
        char[] chars = s.toCharArray();
        for(int i = chars.length-1; i>= 0; i--){
            bucket += chars[i];
        }
        return bucket;
    }

    //turn a string into leet code
    public static String leetCode(String s){
        String bucket = "";
        char[] chars = s.toCharArray();
        for(char c: chars){
            switch(c){
                case 'e':
                case 'E':
                    bucket += 3;
                    break;
                case 'T':
                case 't':
                    bucket += 7;
                    break;
                case 'L':
                case 'l':
                    bucket += 1;
                    break;
                case 'O':
                case 'o':
                    bucket += 0;
                    break;
                default:
                    bucket += c;
                    break;
            }
        }




        return bucket;
    }



    //turn a string into an array of chars
    public static char[] makeStringToCharArray(String s){
        return s.toCharArray();
    }

    //concat two strings together
    public static String combineTwoStrings(String a, String b){
        return a.concat(" " + b);
    }
}
