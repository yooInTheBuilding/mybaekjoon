package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());
        int newN = (int)Math.round(n * 3 / 20);
        double[] doubles = new double[(int)n];
        double sum = 0;
        for (int i = 0; i < n; i++){
            doubles[i] = Double.parseDouble(br.readLine());
        }
        Arrays.sort(doubles);
        for (int i = 0; i < n; i++){
            if (i >= newN && i <= n - 1 - newN){
                sum += doubles[i];
                System.out.println("doubles[i] = " + doubles[i]);
            }
        }
        System.out.println((int)Math.round(sum / (n - (2 * newN))));
    }
}
