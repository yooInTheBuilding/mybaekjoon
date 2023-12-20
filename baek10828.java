package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N + 1];
        int tip = 0;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            String s1 = br.readLine();
            if (s1.contains("push")){
                tip++;
                st = new StringTokenizer(s1);
                String first = st.nextToken();
                stack[tip] = Integer.parseInt(st.nextToken());
            } else if (s1.equals("pop")) {
                int temp = stack[tip];
                stack[tip] = 0;
                if (tip == 0){
                    sb.append(-1).append("\n");
                }else {
                    sb.append(temp).append("\n");
                    tip--;
                }
            } else if (s1.equals("size")) {
                sb.append(tip).append("\n");
            } else if (s1.equals("empty")) {
                if (tip == 0) {
                    sb.append(1).append("\n");
                }else {
                    sb.append(0).append("\n");
                }
            } else if (s1.equals("top")) {
                if (tip == 0){
                    sb.append(-1).append("\n");
                }else {
                    sb.append(stack[tip]).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
