package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>(N);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            int card = Integer.parseInt(st.nextToken());
            if (hashMap.containsKey(card)){
                hashMap.put(card, hashMap.get(card) + 1);
            }else {
                hashMap.put(card, 1);
            }
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < M; i++){
            int var1 = Integer.parseInt(st.nextToken());
            if (hashMap.containsKey(var1)){
                sb.append(hashMap.get(var1)).append(" ");
            }else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}
