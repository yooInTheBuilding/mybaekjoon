package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek1351 {
    static HashMap<Long, Long> hashMap;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long P = Long.parseLong(st.nextToken());
        long Q = Long.parseLong(st.nextToken());
        hashMap = new HashMap<>();
        hashMap.put(0L, 1L);
        System.out.println(aFunc(N, P, Q));
    }
    static Long aFunc(long N, long P, long Q){
        if (hashMap.containsKey(N)){
            return hashMap.get(N);
        }
        Long val = aFunc(N / P, P, Q) + aFunc(N / Q, P, Q);
        hashMap.put(N, val);
        return val;
    }
}
