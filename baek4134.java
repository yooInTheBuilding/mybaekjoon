package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class baek4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] arr = new long[T];
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            arr[i] = Long.parseLong(br.readLine());
            BigInteger bigInteger = new BigInteger(String.valueOf(arr[i]));
            sb.append(findPrime(bigInteger)).append("\n");
        }
        System.out.println(sb);
    }
    public static BigInteger findPrime(BigInteger bigInteger){
        if (bigInteger.isProbablePrime(10)){
            return bigInteger;
        }else {
            return bigInteger.nextProbablePrime();
        }
    }
}
