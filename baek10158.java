package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());
        int sumX = (p + t) % (2 * w);
        int sumY = (q + t) % (2 * h);
        int x = sumX < w ? sumX : 2 * w - sumX;
        int y = sumY < h ? sumY : 2 * h - sumY;
        System.out.println(x + " " + y);
    }
}
