package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baek11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> { // 큰 수를 우선적으로 poll하는 우선순위 큐
            return Integer.compare(o2, o1); // o2가 크면 양수, o1이 크면 음수, 같으면 0
        });
        StringBuilder sb = new StringBuilder(); // 출력할 때마다 출력문을 만들어서 출력하는 것보다 한 번에 출력하는 것이 더 빠르다.
        for (int i = 0; i < N; i++){ // N번 반복
            int x = Integer.parseInt(br.readLine());// x를 입력받는다.
            if (x == 0){// x가 0이면
                if (priorityQueue.isEmpty()){// 우선순위 큐가 비어있으면
                    sb.append(0).append("\n");// 0을 출력한다.
                }else {// 우선순위 큐가 비어있지 않으면
                    sb.append(priorityQueue.poll()).append("\n");// 우선순위 큐에서 poll한 값을 출력한다.
                }
            }else {// x가 0이 아니면
                priorityQueue.add(x);// 우선순위 큐에 x를 추가한다.
            }
        }
        System.out.println(sb);// 출력한다.
    }
}
