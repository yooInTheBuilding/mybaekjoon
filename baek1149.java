package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1149 {
    static int[] red;
    static int[] green;
    static int[] blue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        red = new int[N];
        green = new int[N];
        blue = new int[N];
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            red[i] = Integer.parseInt(st.nextToken());
            green[i] = Integer.parseInt(st.nextToken());
            blue[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < N; i++){
            red[i] += Math.min(green[i - 1], blue[i - 1]);
            green[i] += Math.min(red[i - 1], blue[i - 1]);
            blue[i] += Math.min(red[i - 1], green[i - 1]);
        }
        System.out.println(Math.min(Math.min(red[N - 1], green[N - 1]), blue[N - 1]));
    }
}
