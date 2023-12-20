package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int j = 2; j <= n / 2; j++){
                if (!num[j] && !num[n - j]){
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
