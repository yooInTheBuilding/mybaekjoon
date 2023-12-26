package practice_alone;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int center = 10000;
        int often = 10000;
        for (int i = 0; i < N; i++){
            int var1 = Integer.parseInt(br.readLine());
            sum += var1;
            arr[var1 + 4000]++;
            if (max < var1){
                max = var1;
            }
            if (min > var1){
                min = var1;
            }
        }
        int cnt = 0;
        int oftenMax = 0;
        boolean check = false;
        for (int i = min + 4000; i <= max + 4000; i++){
            if (arr[i] > 0){
                if (cnt < (N + 1) / 2){
                    cnt += arr[i];
                    center = i - 4000;
                }
                if (oftenMax < arr[i]){
                    oftenMax = arr[i];
                    often = i - 4000;
                    check = true;
                } else if (oftenMax == arr[i] && check == true) {
                    often = i - 4000;
                    check = false;
                }
            }
        }
        System.out.println((int)Math.round((double) sum / N));
        System.out.println(center);
        System.out.println(often);
        System.out.println(max - min);
    }
}
