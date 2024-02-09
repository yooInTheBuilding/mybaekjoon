package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek5341 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            int n = Integer.parseInt(br.readLine());
            if (n == 0){
                break;
            }
            sb.append(sum(n)).append("\n");
        }
        System.out.println(sb);
    }
    static int sum(int n){
        return n * (n + 1) / 2;
    }
}
