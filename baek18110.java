package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int cut = (int) Math.round(n * 0.15);
        for (int i = 0; i < n; i++){
            if (i < cut || i > n - 1 - cut){
                continue;
            }
            sum += arr[i];
        }
        int result = (int) Math.round((double) sum / (n - cut * 2));
        System.out.println(result);
    }
}
