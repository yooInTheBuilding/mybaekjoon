package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int count=num;

        for(int c = 0; c < num; c++) {
            String s1 = br.readLine();
            boolean[] test = new boolean[26];

            for(int i = 0; i < s1.length() - 1; i++) {
                if(s1.charAt(i) != s1.charAt(i+1)) {
                    if(test[s1.charAt(i+1)-97]) {
                        count--;
                        break;
                    }
                }
                test[s1.charAt(i) - 97]=true;
            }
        }
        System.out.println(count);





    }
}
