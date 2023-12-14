package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int NFac = 1;
        int KFac = 1;
        int K2Fac = 1;
        for (int i = 1; i <= N; i++){
            NFac *= i;
        }
        for (int i = 1; i <= K; i++){
            KFac *= i;
        }
        for (int i = 1; i <= N - K; i++){
            K2Fac *= i;
        }
        System.out.println(NFac / (KFac * K2Fac));

    }
}
