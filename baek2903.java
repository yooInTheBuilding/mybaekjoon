package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int var1 = 2;
        int var2 = 0;
        for (int i = 1; i <= N; i++){
            var2 = (var1 + 1) * (var1 + 1);
            var1 *= 2;
        }
        System.out.println(var2);
    }
}
