package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();
        while (N > 0){
            int var1 = N % B;
            if (var1 > 9){
                list.add(String.valueOf((char)(var1 + 55)));
            }else {
                list.add(String.valueOf(var1));
            }
            N /= B;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--){
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}
