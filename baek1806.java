package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = 0;
        int sum = 0;
        int cnt = Integer.MAX_VALUE;
        while (start < N){
            if (end < N) {
                if (sum < S) {
                    end++;
                    sum += arr[end - 1];
                } else {
                    if (end - start < cnt) {
                        cnt = end - start;
                    }
                    start++;
                    sum -= arr[start - 1];
                }
            }else {
                if (sum >= S){
                    if (end - start < cnt){
                        cnt = end - start;
                    }
                }
                start++;
                sum -= arr[start - 1];
            }
        }
        if (cnt == Integer.MAX_VALUE){
            cnt = 0;
        }
        System.out.println(cnt);
    }
}
