package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] arrK = new int[T];
        int[] arrN = new int[T];
        int[][] arrHome;
        int[] arrAns = new int[T];
        for (int i = 0; i < T; i++){
            arrK[i] = Integer.parseInt(br.readLine())+1;
            arrN[i] = Integer.parseInt(br.readLine());
            arrHome = new int[arrK[i]][arrN[i]];
            for (int j = 0; j < arrN[i]; j++){
                arrHome[0][j] = j + 1;
            }
            for (int j = 0; j < arrK[i]; j++){
                arrHome[j][0] = 1;
            }
            for (int j = 1; j < arrK[i]; j++){
                for (int k = 1; k < arrN[i]; k++){
                    arrHome[j][k] = arrHome[j-1][k] + arrHome[j][k-1];
                }
            }
            arrAns[i] = arrHome[arrK[i]-1][arrN[i]-1];
        }
        for (int i = 0; i < arrAns.length; i++){
            System.out.println(arrAns[i]);
        }
    }
}
