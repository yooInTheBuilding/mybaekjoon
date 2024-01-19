package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            hashMap.put(Integer.parseInt(st.nextToken()), 1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            if (hashMap.containsKey(Integer.parseInt(st.nextToken()))){
                sb.append(1).append(" ");
            }else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
