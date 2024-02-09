package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baek6840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < 3; i++){
            queue.add(Integer.parseInt(br.readLine()));
        }
        queue.poll();
        System.out.println(queue.poll());
    }
}
