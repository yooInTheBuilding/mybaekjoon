package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }
    static long factorial(int N){
        if (N == 0){
            return 1;
        }
        long fac = 1;
        for (int i = 1; i <= N; i++){
            fac *= i;
        }
        return fac;
    }
}
