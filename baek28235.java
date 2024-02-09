package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek28235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        if (string.equals("SONGDO")){
            System.out.println("HIGHSCHOOL");
        } else if (string.equals("CODE")) {
            System.out.println("MASTER");
        } else if (string.equals("2023")) {
            System.out.println("0611");
        } else if (string.equals("ALGORITHM")) {
            System.out.println("CONTEST");
        }
    }
}
