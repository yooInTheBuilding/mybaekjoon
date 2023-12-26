package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (min > arr[i][j]){
                    min = arr[i][j];
                }
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int minAns = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++){
            int plus = 0;
            int minus = 0;
            for(int j = 0; j < N; j++){
                for (int k = 0; k < M; k++){
                    if (i >= arr[j][k]){
                        plus += i - arr[j][k];
                    }else {
                        minus += arr[j][k] - i;
                    }
                }
            }
            if (plus - minus <= B){
                int n = plus + (2 * minus);
                if (hashMap.containsKey(n)){
                    if (hashMap.get(n) < i){
                        hashMap.put(n, i);
                        if (minAns > n){
                            minAns = n;
                        }
                    }
                }else {
                    hashMap.put(n, i);
                    if (minAns > n){
                        minAns = n;
                    }
                }

            }
        }
        System.out.println(minAns + " " + hashMap.get(minAns));
    }
}
