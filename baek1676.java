package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int five = 0;
        int temp;

        if (N != 0) {
            for (int i = 1; i <= N; i++) {
                temp = i;
                while (i % 5 == 0) {
                    five++;
                    i /= 5;
                }
                i = temp;
            }
        }
        System.out.println(five);
    }
}
