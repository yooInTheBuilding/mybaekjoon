package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class baek24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            if (Integer.parseInt(st.nextToken()) == 0){
                arr[i] = true;
            }else {
                arr[i] = false;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i]){
                stack.push(Integer.parseInt(st.nextToken()));
            }else {
                st.nextToken();
            }
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            queue.add(Integer.parseInt(st.nextToken()));
            sb.append(queue.poll()).append(" ");
        }
        System.out.println(sb);
    }
}
