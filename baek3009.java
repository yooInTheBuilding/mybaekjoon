package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Integer[] arrX = new Integer[3];
        Integer[] arrY = new Integer[3];
        int ansX;
        int ansY;
        for (int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }
        if (arrX[0].compareTo(arrX[1]) == 0){
            ansX = arrX[2];
        }else {
            if (arrX[0].compareTo(arrX[2]) == 0){
                ansX = arrX[1];
            }else {
                ansX = arrX[0];
            }
        }
        if (arrY[0].compareTo(arrY[1]) == 0){
            ansY = arrY[2];
        }else {
            if (arrY[0].compareTo(arrY[2]) == 0){
                ansY = arrY[1];
            }else {
                ansY = arrY[0];
            }
        }
        System.out.println(ansX + " " + ansY);
    }
}
