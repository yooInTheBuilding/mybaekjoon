package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            if (I == 1){
                sb.append(arr[J - 1]).append("\n");
            }else {
                sb.append(arr[J - 1] - arr[I - 2]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
