package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class baek1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++){
            BigInteger bigInteger = new BigInteger(String.valueOf(i));
            if (bigInteger.isProbablePrime(10)){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
