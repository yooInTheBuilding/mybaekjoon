package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek24736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(
                    6 * Integer.parseInt(st.nextToken())
                    + 3 * Integer.parseInt(st.nextToken())
                    + 2 * Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken())
                    + 2 * Integer.parseInt(st.nextToken())
            ).append(" ");
        }
        System.out.println(sb);
    }
}
