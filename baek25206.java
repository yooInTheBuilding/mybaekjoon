package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[][] arr = new String[20][3];
        double sum = 0;
        double credit = 0;
        String s1;

        for (int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            s1 = st.nextToken();
            if (s1.equals("A+")){
                arr[i][2] = "4.5";
            }else if (s1.equals("A0")){
                arr[i][2] = "4.0";
            }else if (s1.equals("B+")){
                arr[i][2] = "3.5";
            }else if (s1.equals("B0")){
                arr[i][2] = "3.0";
            }else if (s1.equals("C+")){
                arr[i][2] = "2.5";
            }else if (s1.equals("C0")){
                arr[i][2] = "2.0";
            }else if (s1.equals("D+")){
                arr[i][2] = "1.5";
            }else if (s1.equals("D0")){
                arr[i][2] = "1.0";
            }else if (s1.equals("F")){
                arr[i][2] = "0.0";
            }else if (s1.equals("P")){
                arr[i][1] = "0.0";
                arr[i][2] = "0.0";
            }
        }
        for (int i = 0; i < 20; i++){
            sum += Double.parseDouble(arr[i][1]) * Double.parseDouble(arr[i][2]);
            credit += Double.parseDouble(arr[i][1]);
        }
        System.out.println(sum / credit);
    }
}
