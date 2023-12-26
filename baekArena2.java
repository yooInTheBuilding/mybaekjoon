package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekArena2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int case1 = (2*N + 1)*(2*N + 1);
        int case2 = 0;
        for (int i = -N; i <= N; i++){
            for (int j = -N; j <= N; j++){
                if (1-i-j >= -N && 1-i-j <= N && i != 0){
                    case2++;
                }
            }
        }
        System.out.println(case1 + case2);
    }
}
