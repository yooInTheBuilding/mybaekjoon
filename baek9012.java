package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++){
            String s1 = br.readLine();
            int cnt = 0;
            for (int j = 0; j < s1.length(); j++){
                if (s1.charAt(j) == '('){
                    cnt++;
                } else if (s1.charAt(j) == ')') {
                    cnt--;
                }
                if (cnt < 0){
                    break;
                }
            }
            if (cnt != 0){
                sb.append("NO").append("\n");
            }else {
                sb.append("YES").append("\n");
            }
        }
        System.out.println(sb);
    }
}
