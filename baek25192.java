package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class baek25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < N; i++){
            String s1 = br.readLine();
            if (s1.equals("ENTER")){
                hashMap = new HashMap<>();
            }else if (!hashMap.containsKey(s1)){
                hashMap.put(s1, 1);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
