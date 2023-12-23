package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        long end = 0L;
        for (int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if (end < arr[i]){
                end = arr[i];
            }
        }
        end++;
        long start = 0L;
        long mid = 0L;
        while (start < end){
            mid = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum += arr[i] / mid;
            }
            if (sum < N){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        System.out.println(start - 1);
    }
}
