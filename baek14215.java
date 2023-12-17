package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        if (max < a){
            max = a;
        }
        if (max < b){
            max = b;
        }
        if (max < c){
            max = c;
        }
        if (max == c){
            while (a + b <= c){
                c--;
            }
        } else if (max == b) {
            while (a + c <= b){
                b--;
            }
        }else {
            while (b + c <= a){
                a--;
            }
        }
        System.out.println(a + b + c);
    }
}
