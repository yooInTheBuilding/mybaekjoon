package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];
        String s1;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 15; j++){
                arr[i][j] = "?";
            }
        }
        for (int i = 0; i < 5; i++){
            s1 = br.readLine();
            for (int j = 0; j < s1.length(); j++){
                arr[i][j] = String.valueOf(s1.charAt(j));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 5; j++){
                if (!arr[j][i].equals("?")){
                    sb.append(arr[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}
