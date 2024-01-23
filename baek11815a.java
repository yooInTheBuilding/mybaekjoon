package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek11815a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s1 = br.readLine();
        String[] s2 = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            long x = Long.parseLong(s2[i]);
            if (Math.sqrt(x) == (long)Math.sqrt(x)){
                sb.append(1).append(" ");
            }else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
