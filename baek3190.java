package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baek3190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 보드의 크기
        int K = Integer.parseInt(br.readLine()); // 사과의 개수
        Map<Integer, Integer> apple = new HashMap<>(); // 사과의 위치
        for (int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            apple.put(N * (Integer.parseInt(st.nextToken()) - 1) + Integer.parseInt(st.nextToken()), 1); // 사과의 위치는 6 * 행(1행부터 시작이기 때문에 -1) + 열
        }
        Deque<Integer> snake = new ArrayDeque<>(); // 뱀의 위치
        snake.addFirst(1); // 뱀의 위치는 1행 1열
        int L = Integer.parseInt(br.readLine()); // 뱀의 방향 변환 횟수
        Map<Integer, String> direction = new HashMap<>(); // 뱀의 방향 변환 정보
        for (int i = 0; i < L; i++){
            st = new StringTokenizer(br.readLine());
            direction.put(Integer.parseInt(st.nextToken()), st.nextToken()); // 뱀의 방향 변환 정보는 시간과 방향(D or L)
        }
        int time = 0; // 시간
        int dir = 1; // 뱀의 방향(1: 오른쪽, 2: 아래, 3: 왼쪽, 4: 위)
        int width = 1; // 뱀 머리의 열
        int height = 1; // 뱀의 높이 행
        while (true){
            if (dir == 1){ //방향이 오른쪽이면
                if (width == N || snake.contains(snake.peekFirst() + 1)){ // 벽에 부딪히거나 자기 자신과 부딪히면
                    break; // 게임 종료
                }else {
                    snake.addFirst(snake.peekFirst() + 1); // 뱀의 머리를 오른쪽으로 한칸 이동
                    if (!apple.containsKey(snake.peekFirst())){ // 사과가 없으면
                        snake.pollLast(); // 뱀의 꼬리를 한칸 줄임
                    }else { // 사과가 있으면
                        apple.remove(snake.peekFirst()); // 사과를 먹음
                    }
                    width++; // 뱀의 머리의 열을 오른쪽으로 한칸 이동
                }
            } else if (dir == 2) { // 방향이 아래쪽이면
                if (height == N || snake.contains(snake.peekFirst() + N)){ // 벽에 부딪히거나 자기 자신과 부딪히면
                    break; // 게임 종료
                }else {
                    snake.addFirst(snake.peekFirst() + N); // 뱀의 머리를 아래쪽으로 한칸 이동
                    if (!apple.containsKey(snake.peekFirst())){ // 사과가 없으면
                        snake.pollLast(); // 뱀의 꼬리를 한칸 줄임
                    }else { // 사과가 있으면
                        apple.remove(snake.peekFirst()); // 사과를 먹음
                    }
                    height++; // 뱀의 머리의 행을 아래쪽으로 한칸 이동
                }
            } else if (dir == 3) { // 방향이 왼쪽이면
                if (width == 1 || snake.contains(snake.peekFirst() - 1)){ // 벽에 부딪히거나 자기 자신과 부딪히면
                    break; // 게임 종료
                }else {
                    snake.addFirst(snake.peekFirst() - 1); // 뱀의 머리를 왼쪽으로 한칸 이동
                    if (!apple.containsKey(snake.peekFirst())){ // 사과가 없으면
                        snake.pollLast(); // 뱀의 꼬리를 한칸 줄임
                    }else {
                        apple.remove(snake.peekFirst()); // 사과를 먹음
                    }
                    width--; // 뱀의 머리의 열을 왼쪽으로 한칸 이동
                }
            } else {
                if (height == 1 || snake.contains(snake.peekFirst() - N)){ // 벽에 부딪히거나 자기 자신과 부딪히면
                    break; // 게임 종료
                }else {
                    snake.addFirst(snake.peekFirst() - N); // 뱀의 머리를 위쪽으로 한칸 이동
                    if (!apple.containsKey(snake.peekFirst())){ // 사과가 없으면
                        snake.pollLast(); // 뱀의 꼬리를 한칸 줄임
                    }else { // 사과가 있으면
                        apple.remove(snake.peekFirst()); // 사과를 먹음
                    }
                    height--; // 뱀의 머리의 행을 위쪽으로 한칸 이동
                }
            }
            time++; // 시간 증가
            if (direction.containsKey(time)){ // 행동종료 및 시간증가가 끝나고 방향을 바꿔야 하는 시간이면
                if (direction.get(time).equals("L")){ // L이면
                    if (dir == 1){ // 방향이 오른쪽이면
                        dir = 4; // 방향을 위쪽으로 바꿈
                    } else if (dir == 2) { // 방향이 아래쪽이면
                        dir = 1; // 방향을 오른쪽으로 바꿈
                    } else if (dir == 3) { // 방향이 왼쪽이면
                        dir = 2; // 방향을 아래쪽으로 바꿈
                    } else { // 방향이 위쪽이면
                        dir = 3; // 방향을 왼쪽으로 바꿈
                    }
                }else { // D이면
                    if (dir == 1){ // 방향이 오른쪽이면
                        dir = 2; // 방향을 아래쪽으로 바꿈
                    } else if (dir == 2) { // 방향이 아래쪽이면
                        dir = 3; // 방향을 왼쪽으로 바꿈
                    } else if (dir == 3) { // 방향이 왼쪽이면
                        dir = 4; // 방향을 위쪽으로 바꿈
                    }else { // 방향이 위쪽이면
                        dir = 1; // 방향을 오른쪽으로 바꿈
                    }
                }
            }
        }
        System.out.println(++time); // 게임이 끝나고 시간을 출력
    }
}
