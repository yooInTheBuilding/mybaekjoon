package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        long[] road = new long[N - 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < road.length; i++){
            road[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        long[] oil = new long[N];
        for (int i = 0; i < oil.length; i++){
            oil[i] = Long.parseLong(st.nextToken());
        }
        long min = 1000000001L;
        long sum = 0L;
        for (int i = 0; i < oil.length - 1; i++){
            if (min > oil[i]){
                min = oil[i];
            }
            sum += min * road[i];
        }
        System.out.println(sum);
    }
}
