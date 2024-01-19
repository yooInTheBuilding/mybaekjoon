package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++){
            hashMap.put(br.readLine(), 1);
        }
        int cnt = 0;
        for (int i = 0; i < M; i++){
            if (hashMap.containsKey(br.readLine())){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
