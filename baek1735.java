package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int numer1 = Integer.parseInt(st.nextToken());
        int deno1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int numer2 = Integer.parseInt(st.nextToken());
        int deno2 = Integer.parseInt(st.nextToken());
        int deno3 = lcm(deno1, deno2);
        int numer3 = (numer1 * (deno3 / deno1)) + (numer2 * (deno3 / deno2));
        int gcdAns = gcd(deno3, numer3);
        System.out.println((numer3/gcdAns) + " " + (deno3/gcdAns));
    }
    public static int gcd(int var1, int var2){
        boolean run = true;
        int temp;
        int gcd = 1;
        if (var1 > var2){
            while (run){
                if (var1 % var2 == 0){
                    run = false;
                    gcd = var2;
                }else {
                    temp = var1 % var2;
                    var1 = var2;
                    var2 = temp;
                }
            }
        }else {
            while (run){
                if (var2 % var1 == 0){
                    run = false;
                    gcd = var1;
                }else {
                    temp = var2 % var1;
                    var2 = var1;
                    var1 = temp;
                }
            }
        }
        return gcd;
    }
    public static int lcm(int var1, int var2){
        int gcd = gcd(var1, var2);
        return (var1 * var2) / gcd;
    }
}
