package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        double a1 = Integer.parseInt(st.nextToken());
        double a0 = Integer.parseInt(st.nextToken());
        double c = Integer.parseInt(br.readLine());
        double n0 = Integer.parseInt(br.readLine());
        if (a1 - c < 0 && (n0 >= a0 / (c - a1) || a0 <= 0)){
            System.out.println(1);
        } else if (c == a1 && a0 <= 0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
