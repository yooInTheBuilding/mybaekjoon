package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int left = K;
        int cnt = 0;
        while (left != 0){
            for (int i = arr.length - 1; i >= 0; i--){
                int mul = 1;
                while (arr[i] * mul <= left){
                    mul++;
                }
                mul--;
                left -= arr[i] * mul;
                cnt += mul;
            }
        }
        System.out.println(cnt);
    }
}
