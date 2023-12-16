package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean run = true;
        int i = 1;
        int cnt = 0;
        while (run){
            if (N % i == 0){
                cnt ++;
                if (cnt == K){
                    System.out.println(i);
                    run = false;
                }else {
                    i++;
                }
            }else {
                i++;
            }
            if (i > N){
                System.out.println(0);
                run = false;
            }
        }
    }
}
