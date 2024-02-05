package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class baek17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] ans = new int[N];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++){
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            stack.push(temp);
        }
        for (int i = arr.length - 1; i >= 0; i--){
            int temp = stack.pop();
            for (int j = 0; j < arr.length; j++){

            }
        }
    }
}
