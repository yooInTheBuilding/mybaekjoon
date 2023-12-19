package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long AB = A * B;
        long temp;
        long gcd = 1;
        long lcm;
        boolean run = true;
        if (A > B){
            while (run){
                if (A % B == 0){
                    gcd = B;
                    run = false;
                }else {
                    temp = A % B;
                    A = B;
                    B = temp;
                }
            }
        }else {
            while (run){
                if (B % A == 0){
                    gcd = A;
                    run = false;
                }else {
                    temp = B % A;
                    B = A;
                    A = temp;
                }
            }
        }
        lcm = AB / gcd;
        System.out.println(lcm);
    }
}
