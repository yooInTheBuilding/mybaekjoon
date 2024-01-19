package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baek1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if (x == 0){
                if (priorityQueue.isEmpty()){
                    sb.append(0).append("\n");
                }else {
                    sb.append(priorityQueue.poll()).append("\n");
                }
            }else {
                priorityQueue.add(x);
            }
        }
        System.out.println(sb);
    }
}
