package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arrCard = new int[N];
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrCard.length; i++){
            arrCard[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < arrCard.length; i++){
            for (int j = i + 1; j < arrCard.length; j++){
                for (int k = j + 1; k < arrCard.length; k++){
                    if (ans < arrCard[i] + arrCard[j] + arrCard[k]
                    && arrCard[i] + arrCard[j] + arrCard[k] <= M){
                        ans = arrCard[i] + arrCard[j] + arrCard[k];
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
