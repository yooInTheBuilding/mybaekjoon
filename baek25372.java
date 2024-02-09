package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek25372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            String string = br.readLine();
            if (string.length() >= 6 && string.length() <= 9){
                sb.append("yes").append("\n");
            }else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}
