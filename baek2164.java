package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baek2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue1 = new LinkedList<>();
        for (int i = 1; i <= N; i++){
            queue1.add(i);
        }
        while (queue1.size() != 1){
            queue1.remove();
            queue1.add(queue1.poll());
        }
        System.out.println(queue1.element());
    }
}
