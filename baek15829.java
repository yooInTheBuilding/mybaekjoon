package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String s1 = br.readLine();
        long hashValue = 0L;
        long square = 1L;
        for(int i = 0; i < s1.length(); i++){
            hashValue += (s1.charAt(i) - 'a' + 1) * square;
            square = (square * 31) % 1234567891;
        }
        System.out.println(hashValue % 1234567891);
    }
}
