package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), "+-", true);
        boolean check = false;
        int ans = 0;
        while (st.hasMoreTokens()){
            String s1 = st.nextToken();
            if (s1.equals("-")){
                check = true;
            } else if (!s1.equals("+")) {
                if (check){
                    ans -= Integer.parseInt(s1);
                }else {
                    ans += Integer.parseInt(s1);
                }
            }
        }
        System.out.println(ans);
    }
}
