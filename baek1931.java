package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class baek1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[100001][2];
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++){
            String[] s1 = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s1[0]);
            arr[i][1] = Integer.parseInt(s1[1]);
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]){
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });

    }
}
