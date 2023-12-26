package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++){
            String s = br.readLine();
            hashMap.put(s, 0);
        }
        int cnt = 0;
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            String s1 = br.readLine();
            if (hashMap.containsKey(s1)){
                cnt++;
                list.add(s1);
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for (int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
