package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        double D = Integer.parseInt(st.nextToken());
        double H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        double cross = Math.sqrt(Math.pow(H, 2) + Math.pow(W, 2));
        int realH = (int) ((D * H) / cross);
        int realW = (int) ((D * W) / cross);
        System.out.println(realH + " " + realW);
    }
}
