package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[]{x, y, h - y, w - x};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++){
            if (min > arr1[i]){
                min = arr1[i];
            }
        }
        System.out.println(min);
    }
}
