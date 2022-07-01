package Java;

public class LeetCode {

    public static void main(String[] args) {
        String aString = "Peter";
        String hash = "";
        for (char character : aString.toCharArray()) {
            switch (character){
                case 'a':
                case 'A':
                    hash += 4;
                    break;
                case 'e':
                case 'E':
                    hash += 3;
                    break;
                case 'i':
                case 'I':
                    hash += 1;
                    break;
                case 'o':
                case 'O':
                    hash += 0;
                    break;
                case 'u':
                case 'U':
                    hash += 9;
                    break;
                case 'T':
                case 't':
                    hash += 7;
                    break;
                default:
                    hash += character;
            }
        }
        System.out.println(hash);
    }
}
