package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] stack = new int[1000000];
        int point = 0;
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            if (s1.equals("1")){
                int X = Integer.parseInt(st.nextToken());
                stack[point] = X;
                point++;
            } else if (s1.equals("2")) {
                if (point != 0){
                    sb.append(stack[point - 1]).append("\n");
                    stack[point - 1] = 0;
                    point--;
                }else {
                    sb.append(-1).append("\n");
                }
            } else if (s1.equals("3")) {
                sb.append(point).append("\n");
            } else if (s1.equals("4")) {
                if (point != 0){
                    sb.append(0).append("\n");
                }else {
                    sb.append(1).append("\n");
                }
            } else if (s1.equals("5")) {
                if (point != 0){
                    sb.append(stack[point - 1]).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
