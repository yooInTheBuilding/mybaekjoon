package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekArenaA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cntAns = 0;
        for (int i = 0; i < N; i++){
            String s1 = br.readLine();
            int cnt = 0;
            for (int j = 0; j < M; j++){
                if (s1.charAt(j) == 'O'){
                    cnt++;
                }
            }
            if (cnt > M / 2){
                cntAns++;
            }
        }
        System.out.println(cntAns);
    }
}
