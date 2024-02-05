package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] p1 = new int[2];
        p1[0] = Integer.parseInt(st.nextToken());
        p1[1] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] p2 = new int[2];
        p2[0] = Integer.parseInt(st.nextToken());
        p2[1] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] p3 = new int[2];
        p3[0] = Integer.parseInt(st.nextToken());
        p3[1] = Integer.parseInt(st.nextToken());

        int result = ccw(p1, p2, p3);

        if (result > 0) {
            System.out.println(1);
        } else if (result < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }

    public static int ccw(int[] p1, int[] p2, int[] p3) {
        int temp = p1[0]*p2[1] + p2[0]*p3[1] + p3[0]*p1[1];
        temp = temp - p1[1]*p2[0] - p2[1]*p3[0] - p3[1]*p1[0];
        return temp;
    }
}