package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n > 2) {
            int[] memo = new int[n + 1];
            memo[1] = 1;
            memo[2] = 2;
            for (int i = 3; i < memo.length; i++) {
                memo[i] = (memo[i - 1] + memo[i - 2]) % 10007;
            }
            System.out.println(memo[n] % 10007);
        } else if (n == 2) {
            System.out.println(2);
        } else if (n == 1) {
            System.out.println(1);
        }
    }
}
