package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class baek8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(br.readLine());
        BigInteger sub = new BigInteger(br.readLine());
        BigInteger apple = (total.subtract(sub)).divide(BigInteger.TWO);
        System.out.println(apple.add(sub));
        System.out.println(apple);
    }
}
