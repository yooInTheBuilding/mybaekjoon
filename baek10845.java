package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] queue = new int[N + 1];
        int front = 0;
        int back = 0;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            String s1 = br.readLine();
            if (s1.contains("push")){
                st = new StringTokenizer(s1);
                String first = st.nextToken();
                back++;
                queue[back] = Integer.parseInt(st.nextToken());
                if (front == 0){
                    front++;
                }
            } else if (s1.equals("pop")) {
                int temp = queue[front];
                if (front == 0){
                    sb.append("-1").append("\n");
                }else {
                    sb.append(temp).append("\n");
                }
                if (front == back){
                    front = 0;
                    back = 0;
                }else {
                    front++;
                }
            } else if (s1.equals("size")) {
                if (front == 0 && back == 0){
                    sb.append(0).append("\n");
                }else {
                    sb.append(back - front + 1).append("\n");
                }
            } else if (s1.equals("empty")) {
                if (front == 0 & back == 0){
                    sb.append(1).append("\n");
                }else {
                    sb.append(0).append("\n");
                }
            } else if (s1.equals("front")) {
                if (front == 0){
                    sb.append(-1).append("\n");
                }else {
                    sb.append(queue[front]).append("\n");
                }
            } else if (s1.equals("back")) {
                if (back == 0){
                    sb.append(-1).append("\n");
                }else {
                    sb.append(queue[back]).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
