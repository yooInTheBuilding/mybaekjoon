package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek18409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String string = br.readLine();
        int cnt = 0;
        for (int i = 0; i < N; i++){
            if (
                    string.charAt(i) == 'a'
                    || string.charAt(i) == 'i'
                    || string.charAt(i) == 'u'
                    || string.charAt(i) == 'e'
                    || string.charAt(i) == 'o'
            ){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
