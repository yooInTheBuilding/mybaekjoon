package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dequeue = new int[2 * N + 1];
        int front = N;
        int back = N;
        boolean check = false;
        boolean run = true;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String s1 = br.readLine();
            if (s1.contains("push_front")) {
                st = new StringTokenizer(s1);
                String first = st.nextToken();
                if (check) {
                    front--;
                }
                dequeue[front] = Integer.parseInt(st.nextToken());
                check = true;
            } else if (s1.contains("push_back")) {
                st = new StringTokenizer(s1);
                String first2 = st.nextToken();
                if (check) {
                    back++;
                }
                dequeue[back] = Integer.parseInt(st.nextToken());
                check = true;
            } else if (s1.equals("pop_front")) {
                if (!check) {
                    sb.append(-1).append("\n");
                } else {
                    int temp = dequeue[front];
                    if (front == back) {
                        check = false;
                    } else {
                        front++;
                    }
                    sb.append(temp).append("\n");
                }
            } else if (s1.equals("pop_back")) {
                if (!check) {
                    sb.append(-1).append("\n");
                } else {
                    int temp = dequeue[back];
                    if (front == back) {
                        check = false;
                    } else {
                        back--;
                    }
                    sb.append(temp).append("\n");
                }
            } else if (s1.equals("size")) {
                if (!check) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(back - front + 1).append("\n");
                }
            } else if (s1.equals("empty")) {
                if (check) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            } else if (s1.equals("front")) {
                if (!check) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dequeue[front]).append("\n");
                }
            } else if (s1.equals("back")) {
                if (!check) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dequeue[back]).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
