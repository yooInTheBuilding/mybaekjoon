package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baek9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String explode = br.readLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s1.length(); i++){
            stack.push(s1.charAt(i));
            if (stack.size() >= explode.length() && isExplode(stack, explode)){
                for (int j = 0; j < explode.length(); j++){
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("FRULA");
        }else {
            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
    static boolean isExplode(Stack<Character> stack, String explode){
        for (int i = 0; i < explode.length(); i++){
            if (stack.get(stack.size() - i - 1) != explode.charAt(explode.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
