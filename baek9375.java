package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            hashMap = new HashMap<>();
            for (int j = 0; j < n; j++){
                st = new StringTokenizer(br.readLine());
                String s1 = st.nextToken();
                s1 = st.nextToken();
                if (hashMap.containsKey(s1)){
                    hashMap.put(s1, hashMap.get(s1) + 1);
                }else {
                    hashMap.put(s1, 1);
                }
            }
            int ans = 1;
            for (String key : hashMap.keySet()){
                ans *= (hashMap.get(key) + 1);
            }
            sb.append(ans - 1).append("\n");
        }
        System.out.println(sb);
    }
}
