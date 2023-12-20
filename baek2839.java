package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int five = N / 5;
        while ((N - (five * 5)) % 3 != 0 && five >= 0){
            five--;
        }
        if (five < 0){
            System.out.println(-1);
        }else {
            int three = (N - (five * 5)) / 3;
            System.out.println(five + three);
        }
    }
}
