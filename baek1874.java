package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baek1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int point = 0;
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        for (int i = 0; i < n; i++){
            int var1 = Integer.parseInt(br.readLine());
            if (point > var1) {
                int var2 = stack.pop();
                if (var2 != var1){
                    check = false;
                }else {
                    sb.append("-").append("\n");
                }
            } else if (point < var1) {
                while (point < var1){
                    stack.push(point + 1);
                    point++;
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            }
        }
        if (check) {
            System.out.println(sb);
        }else {
            System.out.println("NO");
        }
    }
}
