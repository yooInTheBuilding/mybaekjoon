package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int check = 0;
        int ans = 0;
        for (int i = 0; i < arr1.length; i++){
            for (int j = 2; j < arr1[i]; j++){
                if (arr1[i] % j == 0){
                    check++;
                }
            }
            if (arr1[i] == 1){
                check++;
            }
            if (check == 0){
                ans++;
            }
            check = 0;
        }
        System.out.println(ans);
    }
}
