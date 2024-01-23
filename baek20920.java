package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        int[] count = new int[N];
        for (int i = 0; i < N; i++){
            String temp = br.readLine();
            if (temp.length() >= M) {
                arr[i] = temp;
                count[i] = temp.length();
            }
        }

    }
}
