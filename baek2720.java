package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] quarter = new int[T];
        int[] dime = new int[T];
        int[] nickel = new int[T];
        int[] penny = new int[T];
        int[] change = new int[T];
        for (int i = 0; i < T; i++){
            change[i] = Integer.parseInt(br.readLine());
            quarter[i] = change[i] / 25;
            change[i] = change[i] % 25;
            dime[i] = change[i] / 10;
            change[i] = change[i] % 10;
            nickel[i] = change[i] / 5;
            change[i] = change[i] % 5;
            penny[i] = change[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++){
            sb.append(quarter[i]).append(" ").append(dime[i]).append(" ");
            sb.append(nickel[i]).append(" ").append(penny[i]).append("\n");
        }
        System.out.println(sb);
    }
}
