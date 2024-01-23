package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baek11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 연산의 개수
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {// 우선순위 큐를 만든다.
            if (Math.abs(o1) == Math.abs(o2)){// 절댓값이 같으면
                return Integer.compare(o1, o2);// 오름차순으로 정렬한다.
            } else {// 절댓값이 다르면
                return Integer.compare(Math.abs(o1), Math.abs(o2));// 절댓값을 기준으로 오름차순으로 정렬한다.
            }
        });
        StringBuilder sb = new StringBuilder();// 출력할 때마다 출력문을 만들어서 출력하는 것보다 한 번에 출력하는 것이 더 빠르다.
        for (int i = 0; i < N; i++){
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
