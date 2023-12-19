package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        int[] arrGcd = new int[N - 1];
        for (int i = 0; i < N; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arrGcd.length; i++){
            arrGcd[i] = arr1[i + 1] - arr1[i];
        }
        int gcd = gcd(arrGcd[0], arrGcd[1]);
        for (int i = 2; i < arrGcd.length; i++){
            gcd = gcd(gcd, arrGcd[i]);
        }
        System.out.println(((arr1[N - 1] - arr1[0]) / gcd) + 1 - arr1.length);




    }
    public static int gcd(int var1, int var2){
        boolean run = true;
        int temp;
        int gcd = 1;
        if (var1 > var2){
            while (run){
                if (var1 % var2 == 0){
                    run = false;
                    gcd = var2;
                }else {
                    temp = var1 % var2;
                    var1 = var2;
                    var2 = temp;
                }
            }
        }else {
            while (run){
                if (var2 % var1 == 0){
                    run = false;
                    gcd = var1;
                }else {
                    temp = var2 % var1;
                    var2 = var1;
                    var1 = temp;
                }
            }
        }
        return gcd;
    }
}
