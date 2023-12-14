package practice_alone;

import java.io.*;
import java.util.Arrays;

public class baek10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr1);
        for (int i = 0; i < N; i++){
            bw.write(arr1[i] + "\n");
        }
        bw.close();
    }
}
