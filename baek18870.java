package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baek18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++){
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = i;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[1] - o2[1];
            }
        });
        int[] result = new int[N];
        int count = 0;
        result[arr[0][0]] = count;
        for (int i = 1; i < N; i++){
            if (arr[i][1] == arr[i - 1][1]){
                result[arr[i][0]] = count;
            } else {
                result[arr[i][0]] = ++count;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
}
