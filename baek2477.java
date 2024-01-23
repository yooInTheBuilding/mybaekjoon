package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int K = Integer.parseInt(br.readLine());
        int volume = 0;
        int[] index = {0, 0, 0, 0};
        int[][] value = new int[6][2];
        for (int i = 0; i < 6; i++){
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            index[temp - 1]++;
            value[i][0] = temp;
            value[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 4; i++){
            if (index[i] == 2){
            }
        }
    }
}
