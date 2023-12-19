package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2 * 123456 + 1];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        arr[1] = 0;
        int num = 2;
        while (num <= arr.length - 1){
            if (arr[num] == 0){
                num++;
            }else {
                int mul = 2;
                while (num * mul <= arr.length - 1){
                    arr[num * mul] = 0;
                    mul++;
                }
                num++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (true){
            int n = Integer.parseInt(br.readLine());
            if (n == 0){
                break;
            }
            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++){
                if (arr[i] != 0){
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

}
