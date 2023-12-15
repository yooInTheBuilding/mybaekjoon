package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] max = new int[2];
        int[][] matrix = new int[9][9];
        for (int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if (matrix[i][j] > matrix[max[0]][max[1]]){
                    max[0] = i;
                    max[1] = j;
                }
            }
        }
        System.out.println(matrix[max[0]][max[1]]);
        System.out.println((max[0] + 1) + " " + (max[1] + 1));
    }
}
