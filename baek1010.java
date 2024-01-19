package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class baek1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            BigInteger temp = new BigInteger("1");
            for (int j = 0; j < N; j++){
                temp = temp.multiply(BigInteger.valueOf(M - j));
            }
            for (int j = 1; j <= N; j++){
                temp = temp.divide(BigInteger.valueOf(j));
            }
            sb.append(temp).append("\n");
        }
        System.out.println(sb);
    }
}
