package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek9095 {
    static int[] memo = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;
        for (int i = 4; i <= 10; i ++){
            memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
        }
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(memo[n]).append("\n");
        }
        System.out.println(sb);
    }
}
