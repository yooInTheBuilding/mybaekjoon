package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dequeue = new int[2*N + 2];
        int front = N;
        int back = N + 1;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            if (s1.equals("1")){
                dequeue[front] = Integer.parseInt(st.nextToken());
                front--;
            } else if (s1.equals("2")) {
                dequeue[back] = Integer.parseInt(st.nextToken());
                back++;
            } else if (s1.equals("3")) {
                if (back - front > 1){
                    sb.append(dequeue[++front]).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            } else if (s1.equals("4")) {
                if (back - front > 1){
                    sb.append(dequeue[--back]).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            } else if (s1.equals("5")) {
                sb.append(back - front - 1).append("\n");
            } else if (s1.equals("6")) {
                if (back - front > 1){
                    sb.append(0).append("\n");
                }else {
                    sb.append(1).append("\n");
                }
            } else if (s1.equals("7")) {
                if (back - front > 1){
                    sb.append(dequeue[front + 1]).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            } else if (s1.equals("8")) {
                if (back - front > 1){
                    sb.append(dequeue[back - 1]).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
