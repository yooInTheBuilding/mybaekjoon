package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek24883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        if (string.equals("N") || string.equals("n")){
            System.out.println("Naver D2");
        }else {
            System.out.println("Naver Whale");
        }
    }
}
