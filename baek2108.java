package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0;
        int cnt = 1;
        int cntMax = 0;
        int cntNum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (i >= 1){
                if (arr[i] == arr[i - 1]){
                    cnt++;
                }else {
                    cnt = 1;
                }
            }
            if (cnt > cntMax){
                cntMax = cnt;
                cntNum = arr[i];
            }
        }
        System.out.println(sum / N);
        System.out.println(arr[(N / 2)]);
        System.out.println(cntNum);
        System.out.println(arr[N - 1] - arr[0]);
    }
}
