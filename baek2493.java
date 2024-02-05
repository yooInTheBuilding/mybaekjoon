package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class baek2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] tower = new int[N];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            tower[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && tower[stack.peek()] < tower[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.print("0 ");
            } else {
                System.out.print((stack.peek() + 1) + " ");
            }

            stack.push(i);
        }
    }
}
