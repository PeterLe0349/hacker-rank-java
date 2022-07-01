package Java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger big1 = new BigInteger(in.nextLine());
        BigInteger big2 = new BigInteger(in.nextLine());
        System.out.println(big1.add(big2));
        System.out.println(big1.multiply(big2));
    }
}
