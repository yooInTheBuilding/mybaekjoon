package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek12789a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int upper = 1;
        int lower = 0;
        boolean bool = true;
        boolean check = false;
        while (st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            if (!check && temp != upper){
                check = true;
                lower = temp;
                lower--;
            }
            if (temp == upper){
                upper++;
            } else if (check && temp == lower) {
                lower--;
            }else {
                bool = false;
            }
        }
        if (bool){
            System.out.println("Nice");
        }else {
            System.out.println("Sad");
        }
    }
}
