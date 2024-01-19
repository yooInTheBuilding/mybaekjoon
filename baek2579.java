package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2579 {
    static int[] arr;
    static Integer[] memo;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        memo = new Integer[N + 1];
        for (int i = 0; i < N; i++){
            arr[i + 1] = Integer.parseInt(br.readLine());
        }
        memo[0] = arr[0];
        memo[1] = arr[1];
        if (N >= 2){
            memo[2] = arr[1] + arr[2];
        }
        System.out.println(method1(N));
    }
    static int method1(int N){
        if (memo[N] == null){
            memo[N] = Math.max(method1(N - 2), method1(N - 3) + arr[N - 1]) + arr[N];
        }
        return memo[N];
    }
}
