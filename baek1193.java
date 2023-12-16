package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int var1 = 1;
        int sum = 0;
        int trial = 0;
        while (sum < X){
            sum += var1;
            var1++;
            trial++;
        }
        int n = X - sum + trial;

        if (trial % 2 == 0){
            System.out.println(n + "/" + (trial - n + 1));
        }else {
            System.out.println((trial - n + 1) + "/" + n);
        }

    }
}
