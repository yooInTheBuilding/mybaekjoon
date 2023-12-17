package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arrX = new int[N];
        int[] arrY = new int[N];
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
            if (minX > arrX[i]){
                minX = arrX[i];
            }
            if (minY > arrY[i]){
                minY = arrY[i];
            }
            if (maxX < arrX[i]){
                maxX = arrX[i];
            }
            if (maxY < arrY[i]){
                maxY = arrY[i];
            }
        }
        int ans = (maxX - minX) * (maxY - minY);
        System.out.println(ans);
    }
}
