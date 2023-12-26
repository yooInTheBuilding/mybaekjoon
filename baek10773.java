package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] arr = new int[K];
        for (int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            int temp = i;
            if (arr[temp] == 0) {
                while (arr[temp] == 0) {
                    temp--;
                }
                arr[temp] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
