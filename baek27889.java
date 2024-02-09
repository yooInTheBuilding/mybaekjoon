package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek27889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        if (string.equals("NLCS")){
            System.out.println("North London Collegiate School");
        } else if (string.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        } else if (string.equals("KIS")) {
            System.out.println("Korea International School");
        } else if (string.equals("SJA")) {
            System.out.println("St. Johnsbury Academy");
        }
    }
}
