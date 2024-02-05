package practice_alone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baek18236 {
    static int N;
    static int[] arr, freq, prefixSum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        freq = new int[100001];
        prefixSum = new int[100001];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            freq[arr[i]]++;
        }

        prefixSum[0] = freq[0];
        for (int i = 1; i <= 100000; i++) {
            prefixSum[i] = prefixSum[i - 1] + freq[i];
        }

        long minOps = Long.MAX_VALUE;
        for (int i = 1; i <= 100000; i++) {
            if (freq[i] > 0) {
                long ops = (long) i * prefixSum[i - 1] + (long) (N - prefixSum[i]) * i;
                minOps = Math.min(minOps, ops);
            }
        }

        System.out.println(minOps);
    }
}