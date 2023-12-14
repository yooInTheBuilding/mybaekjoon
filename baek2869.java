package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int ans;
        if (V % (A - B) == 0) {
            ans = V / (A - B);
        }else {
            ans = V / (A - B) + 1;
        }
        boolean run = true;
        while (run){
            if ((A - B) * (ans - 2) + A >= V){
                ans--;
            }else {
                run = false;
            }
        }
        System.out.println(ans);
    }
}
