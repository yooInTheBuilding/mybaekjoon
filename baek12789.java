package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class baek12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); //수의 개수 입력
        st = new StringTokenizer(br.readLine()); //수의 구성 입력
        int cnt = 1; // 뽑아내야 할 수, 순서대로 수를 뽑아야 하기 때문에 수를 뽑아 버릴 때 마다 cnt++
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++){
            queue.add(Integer.parseInt(st.nextToken())); //입력받은 수들을 전부 큐에 삽입
        }
        boolean bool = true; //가능여부를 나타냄
        while (cnt <= N){ //cnt(뽑아내야 할 수)가 N이 넘을때 종료
            if (queue.isEmpty()){ // 큐가 비어있으면 스택에서만 뽑을 수 있기 때문에 stack의 순서가 올바르게 정렬되어 있어야 함
                if (stack.peek() == cnt){ //뽑아야 할 수가 스택의 맨 위일때
                    stack.pop(); //뽑고
                    cnt++; //cnt를 1 증가시킨다
                }else {
                    bool = false; // 한 번이라도 순서가 다르면 정답은 Sad가 됨
                    break; //따라서 바로 반복문 종료
                }
            }else {
                if (queue.peek() == cnt){ // 뽑아야 할 수가 큐의 맨 앞의 수일때
                    queue.poll(); // 뽑아 버리고
                    cnt++; // cnt를 1 증가시킨다
                } else if (!stack.isEmpty()) { //EmptyStackException 발생을 막기 위해 추가
                    if (stack.peek() == cnt) { //뽑아야 할 수가 스택 맨 위에 있을 때
                        stack.pop(); // 뽑아 버리고
                        cnt++; // cnt를 1 증가시킨다
                    }else { // 뽑아야 할 수가 큐와 스택의 맨 앞 수와 다를 때
                        stack.push(queue.poll()); //큐에서 수를 뽑아 스택에 삽입한다
                    }
                }else { //스택에 수가 없을땐 스택에서 수를 뽑을 수 없으므로
                    stack.push(queue.poll()); //큐에서 수를 뽑아 스택에 삽입한다
                }
            }
        }
        if (bool){ //bool==true면 Nice 출력 false면 Sad 출력
            System.out.println("Nice");
        }else {
            System.out.println("Sad");
        }
    }
}
