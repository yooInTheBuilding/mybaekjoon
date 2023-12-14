package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        int count = 0;
        int contain = s1.indexOf("c=");
        while (contain > -1){
            count++;
            contain = s1.indexOf("c=", contain + 1);
        }
        contain = s1.indexOf("c-");
        while (contain > -1){
            count++;
            contain = s1.indexOf("c-", contain + 1);
        }
        contain = s1.indexOf("dz=");
        while (contain > -1){
            count++;
            contain = s1.indexOf("dz=", contain + 1);
        }
        contain = s1.indexOf("d-");
        while (contain > -1){
            count++;
            contain = s1.indexOf("d-", contain + 1);
        }
        contain = s1.indexOf("lj");
        while (contain > -1){
            count++;
            contain = s1.indexOf("lj", contain + 1);
        }
        contain = s1.indexOf("nj");
        while (contain > -1){
            count++;
            contain = s1.indexOf("nj", contain + 1);
        }
        contain = s1.indexOf("s=");
        while (contain > -1){
            count++;
            contain = s1.indexOf("s=", contain + 1);
        }
        contain = s1.indexOf("z=");
        while (contain > -1){
            count++;
            contain = s1.indexOf("z=", contain + 1);
        }
        System.out.println(s1.length() - count);
    }
}
