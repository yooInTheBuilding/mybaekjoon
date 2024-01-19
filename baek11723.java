package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int M = Integer.parseInt(br.readLine());
        int S = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            if (s1.equals("add")){
                int x = Integer.parseInt(st.nextToken());
                S |= (1<<x);
            } else if (s1.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                S &= ~(1<<x);
            } else if (s1.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                if ((S & (1<<x)) == (1<<x)){
                    sb.append(1).append("\n");
                }else {
                    sb.append(0).append("\n");
                }
            } else if (s1.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                S ^= (1<<x);
            } else if (s1.equals("all")) {
                S = (1<<21) - 2;
            } else if (s1.equals("empty")) {
                S = 0;
            }
        }
        System.out.println(sb);
    }
}
