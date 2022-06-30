package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class isPrime {

    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        int num = Integer.parseInt(n);
        BigInteger big2 = new BigInteger(n);
        if(big2.isProbablePrime(100)){ //1 did not work, 100 passes test,
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }


    }



}
