package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class baek27434 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        System.out.println(fac(N));
    }

    static BigInteger fac(BigInteger N){
        if (N.equals(new BigInteger("0"))){
            return BigInteger.ONE;
        }
        return N.multiply(fac(N.subtract(BigInteger.ONE)));
    }
}
