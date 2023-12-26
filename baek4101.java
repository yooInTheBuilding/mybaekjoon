package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean run = true;
        StringBuilder sb = new StringBuilder();
        while (run){
            String s1 = br.readLine();
            if (s1.equals("0 0")){
                run = false;
            }else {
                st = new StringTokenizer(s1);
                int var1 = Integer.parseInt(st.nextToken());
                int var2 = Integer.parseInt(st.nextToken());
                if (var1 > var2){
                    sb.append("Yes").append("\n");
                }else {
                    sb.append("No").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
