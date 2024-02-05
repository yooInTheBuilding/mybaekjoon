package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baek1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++){
            queue.add(Integer.parseInt(br.readLine()));
        }
        int ans = 0;
        while (queue.size() > 1){
            int sum = queue.poll() + queue.poll();
            ans += sum;
            queue.add(sum);
        }
        System.out.println(ans);
    }
}