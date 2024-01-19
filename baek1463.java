package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N > 3) {
            int[] memo = new int[N + 1];
            memo[2] = 1;
            memo[3] = 1;
            for (int i = 4; i < memo.length; i++) {
                if (i % 6 == 0) {
                    int min = Integer.MAX_VALUE;
                    if (min > memo[i / 3]) {
                        min = memo[i / 3];
                    }
                    if (min > memo[i / 2]) {
                        min = memo[i / 2];
                    }
                    if (min > memo[i - 1]) {
                        min = memo[i - 1];
                    }
                    memo[i] = min + 1;
                } else if (i % 3 == 0) {
                    if (memo[i / 3] <= memo[i - 1]) {
                        memo[i] = memo[i / 3] + 1;
                    } else {
                        memo[i] = memo[i - 1] + 1;
                    }
                } else if (i % 2 == 0) {
                    if (memo[i / 2] <= memo[i - 1]) {
                        memo[i] = memo[i / 2] + 1;
                    } else {
                        memo[i] = memo[i - 1] + 1;
                    }
                } else {
                    memo[i] = memo[i - 1] + 1;
                }
            }
            System.out.println(memo[N]);
        } else if (N == 3) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.println(1);
        } else if (N == 1) {
            System.out.println(0);
        }
    }
}
