package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> hashMap1 = new HashMap<>();
        for (int i = 1; i <= N; i++){
            String s = br.readLine();
            hashMap1.put(String.valueOf(i), s);
            hashMap1.put(s, String.valueOf(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            String s1 = br.readLine();
            sb.append(hashMap1.get(s1)).append("\n");
        }
        System.out.println(sb);
    }
}
