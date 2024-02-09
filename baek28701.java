package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek28701 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sqare = (N * (N + 1)) / 2;
        System.out.println(sqare);
        System.out.println(sqare * sqare);
        System.out.println(sqare * sqare);
    }
}
