package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek8545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s1.charAt(2)).append(s1.charAt(1)).append(s1.charAt(0));
        System.out.println(sb);
    }
}
