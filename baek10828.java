package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baek10828 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> stack = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String string = br.readLine();
            if (string.contains("push")) {
                int X = Integer.parseInt(String.valueOf(string.charAt(string.length() - 1)));
                stack.add(X);
            } else if (string.contains("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    int temp = stack.get(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    sb.append(temp).append("\n");
                }
            } else if (string.contains("size")) {
                sb.append(stack.size()).append("\n");
            } else if (string.contains("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (string.contains("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.get(stack.size() - 1)).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
