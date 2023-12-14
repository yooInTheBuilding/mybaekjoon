package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int i = 1;
        int j = 0;
        boolean run = true;
        int ans = 0;
        boolean check = false;
        boolean run2 = true;
        while (run){
            while(run2){
                if ((i / Math.pow(10, j)) < 100){
                    run2 = false;
                }
                if ((int)(i / Math.pow(10, j)) % 1000 == 666){
                    check = true;
                }
                j++;
            }
            if(check){
                ans++;
            }
            if(ans == N){
                run = false;
                System.out.println(i);
            }
            j = 0;
            run2 = true;
            check = false;
            i++;
        }
    }
}
