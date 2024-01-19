package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baek2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int max = arr[N - 1];
        int min = 0;
        int mid = 0;
        int result = 0;
        while (min < max){
            long sum = 0;
            mid = (min + max) / 2;
            for (int height : arr){
                if (height - mid > 0){
                    sum += (height - mid);
                }
            }
            if (sum >= M){
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        System.out.println(min - 1);
    }
}
