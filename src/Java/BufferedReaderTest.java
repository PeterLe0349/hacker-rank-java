package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s = br.readLine();
        System.out.printf("Your string input is: %s%n", s);
        System.out.println("Enter a number");
        int n = Integer.parseInt(br.readLine());
        System.out.printf("Your numeric input is: %d%n", n);






        br.close();
    }
}
