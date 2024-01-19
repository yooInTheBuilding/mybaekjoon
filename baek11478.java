package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class baek11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <= S.length(); i++){
            for (int j = 0; j + i - 1 < S.length(); j++){
                String s1 = S.substring(j, j + i);
                if (!hashMap.containsKey(s1)){
                    hashMap.put(s1, 1);
                }
            }
        }
        System.out.println(hashMap.size());
    }
}
