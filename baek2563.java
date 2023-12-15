package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int var1 = Integer.parseInt(br.readLine());
        int[][] canvas = new int[100][100];
        int var2;
        int var3;
        int count = 0;
        for (int i = 0; i < var1; i++){
            st = new StringTokenizer(br.readLine());
            var2 = Integer.parseInt(st.nextToken());
            var3 = Integer.parseInt(st.nextToken());
            for (int j = var2; j < var2 + 10; j++){
                for (int k = var3; k < var3 + 10; k++){
                    canvas[j][k]++;
                }
            }
        }
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                if (canvas[i][j] >= 1){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
