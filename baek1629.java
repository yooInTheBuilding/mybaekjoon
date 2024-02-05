package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class baek1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
        HashMap<Long, Long> memo = new HashMap<>();
        A /= C;
        int cnt = 0;
        while (cnt < B){
            if (!memo.containsKey(A)){
                long temp = A;
                A = A * A / C;
                memo.put(temp, A);
                cnt++;
            }else {

            }
        }
    }
}
