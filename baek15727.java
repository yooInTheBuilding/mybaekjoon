package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        if (L % 5 == 0){
            System.out.println(L / 5);
        }else {
            System.out.println((L / 5) + 1);
        }
    }
}
