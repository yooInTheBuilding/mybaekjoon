package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int var1 = Integer.parseInt(st.nextToken());
        int var2 = Integer.parseInt(st.nextToken());
        int gcd;
        int lcm;

        if (var1 >= var2){
            gcd = var2;
            lcm = var1;

        }else {
            gcd = var1;
            lcm = var2;
        }
        while(var1 % gcd != 0 || var2 % gcd != 0){
            gcd--;
        }
        while (lcm % var1 != 0 || lcm % var2 != 0){
            lcm++;
        }
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
