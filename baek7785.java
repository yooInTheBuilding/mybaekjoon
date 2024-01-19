package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baek7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            if (!hashMap.containsKey(s1)){
                hashMap.put(s1, 1);
            }else {
                hashMap.remove(s1);
            }
        }
        List<String> keySet = new ArrayList<>(hashMap.keySet());
        keySet.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String key : keySet){
            sb.append(key).append("\n");
        }
        System.out.println(sb);
    }
}
