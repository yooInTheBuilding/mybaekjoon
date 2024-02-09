package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek23235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        while (true){
            String string = br.readLine();
            if (string.equals("0")){
                break;
            }
            sb.append("Case ").append(cnt).append(": Sorting... done!").append("\n");
            cnt++;
        }
        System.out.println(sb);
    }
}
