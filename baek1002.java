package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int d = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            int sum = (int) (Math.pow(r1 + r2, 2));
            int sub = (int) (Math.pow(r1 - r2, 2));
            if (d == 0){
                if (r1 == r2){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (d == sum || d == sub){
                sb.append(1).append("\n");
            } else if (d < sum && d > sub){
                sb.append(2).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
