package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] queue = new int[2000001];
        int back = 0;
        int front = 0;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            if (s1.equals("push")){
                queue[back] = Integer.parseInt(st.nextToken());
                back++;
            } else if (s1.equals("pop")) {
                if (back - front != 0) {
                    sb.append(queue[front]).append("\n");
                    queue[front] = 0;
                    front++;
                }else {
                    sb.append(-1).append("\n");
                }
            } else if (s1.equals("size")) {
                sb.append(back - front).append("\n");
            } else if (s1.equals("empty")) {
                if (back == front){
                    sb.append(1).append("\n");
                }else {
                    sb.append(0).append("\n");
                }
            } else if (s1.equals("front")) {
                if (back - front != 0) {
                    sb.append(queue[front]).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            } else if (s1.equals("back")) {
                if (back - front != 0) {
                    sb.append(queue[back - 1]).append("\n");
                }else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
