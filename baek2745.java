package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;
        int temp = 1;
        for (int i = N.length() - 1; i >= 0; i--){
            char C = N.charAt(i);
            if ('A' <= C && C <= 'Z'){
                sum += (C - 'A' + 10) * temp;
            }else {
                sum += (C - '0') * temp;
            }
            temp *= B;

        }
        System.out.println(sum);
    }
}
