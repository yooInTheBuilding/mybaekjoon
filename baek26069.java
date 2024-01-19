package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("ChongChong", 1);
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            if (hashMap.containsKey(s1) && hashMap.containsKey(s2)){
                continue;
            } else if (hashMap.containsKey(s1)) {
                hashMap.put(s2, 1);
            } else if (hashMap.containsKey(s2)) {
                hashMap.put(s1, 1);
            }
        }
        System.out.println(hashMap.size());
    }
}
