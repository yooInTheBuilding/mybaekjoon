package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek14581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        System.out.println(":fan::fan::fan:");
        System.out.print(":fan:");
        System.out.print(":" + s1 + ":");
        System.out.println(":fan:");
        System.out.println(":fan::fan::fan:");
    }
}
