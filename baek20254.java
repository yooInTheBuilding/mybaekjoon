package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek20254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ur = Integer.parseInt(st.nextToken());
        int tr = Integer.parseInt(st.nextToken());
        int uo = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());
        int ans = 56 * ur + 24 * tr + 14 * uo + 6 * to;
        System.out.println(ans);
    }
}
