package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int[] arrA = new int[T];
        int[] arrB = new int[T];
        int[] arrAB = new int[T];
        int[] arrGcd = new int[T];
        int[] arrLcm = new int[T];
        int temp;
        boolean run = true;
        for (int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            arrA[i] = Integer.parseInt(st.nextToken());
            arrB[i] = Integer.parseInt(st.nextToken());
            arrAB[i] = arrA[i] * arrB[i];
            while (run) {
                if (arrA[i] > arrB[i]) {
                    if (arrA[i] % arrB[i] == 0) {
                        arrGcd[i] = arrB[i];
                        run = false;
                    } else {
                        temp = arrA[i] % arrB[i];
                        arrA[i] = arrB[i];
                        arrB[i] = temp;
                    }
                }else {
                    if (arrB[i] % arrA[i] == 0){
                        arrGcd[i] = arrA[i];
                        run = false;
                    }else {
                        temp = arrB[i] % arrA[i];
                        arrB[i] = arrA[i];
                        arrA[i] = temp;
                    }
                }
            }
            run = true;
        }
        for (int i = 0; i < T; i++){
            arrLcm[i] = arrAB[i] / arrGcd[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrLcm.length; i++){
            sb.append(arrLcm[i]).append("\n");
        }
        System.out.println(sb);
    }
}
