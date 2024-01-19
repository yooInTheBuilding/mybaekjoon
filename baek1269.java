package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++){
            hashMap.put(Integer.parseInt(st.nextToken()), 1);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++){
            int var1 = Integer.parseInt(st.nextToken());
            if (hashMap.containsKey(var1)){
                hashMap.remove(var1);
            }else {
                hashMap.put(var1, 1);
            }
        }
        System.out.println(hashMap.size());
    }
}
