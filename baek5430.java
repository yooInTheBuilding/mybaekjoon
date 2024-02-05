package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baek5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) { // 테스트 케이스의 개수만큼 반복
            String p = br.readLine(); // 수행할 함수
            int n = Integer.parseInt(br.readLine()); // 배열에 들어있는 수의 개수
            String array = br.readLine(); // 배열에 들어있는 수
            st = new StringTokenizer(array, "[],"); // [ ] , 를 기준으로 토큰화
            int[] arr = new int[n]; // 배열 생성
            for (int j = 0; j < arr.length; j++){ // 배열에 수 넣기
                arr[j] = Integer.parseInt(st.nextToken());
            }
            boolean reverse = false; // 뒤집힌 상태인지 아닌지
            int point = 0; // 앞에서부터 가리키는 포인터
            int pointReverse = arr.length - 1; // 뒤에서부터 가리키는 포인터
            boolean check = true; // 에러가 발생했는지 아닌지
            for (int j = 0; j < p.length(); j++){ // 함수 수행
                if (p.charAt(j) == 'R'){ // R이면 뒤집기
                    reverse = !reverse;
                } else if (p.charAt(j) == 'D') { // D이면 버리기
                    if (point > pointReverse){ // 버릴게 없으면 에러
                        sb.append("error").append("\n");
                        check = false;
                        break;
                    }else { // 버릴게 있으면
                        if (reverse){ // 뒤집힌 상태면 뒤에서부터 버리기
                            pointReverse--;
                        }else { // 뒤집힌 상태가 아니면 앞에서부터 버리기
                            point++;
                        }
                    }
                }
            }
            if (check){ // 에러가 발생하지 않았으면
                sb.append("[");
                if (!reverse) { // 뒤집힌 상태가 아니면
                    for (int j = point; j <= pointReverse; j++) { // 앞에서부터 출력
                        sb.append(arr[j]);
                        if (j != pointReverse) {
                            sb.append(",");
                        }
                    }
                }else { // 뒤집힌 상태면
                    for (int j = pointReverse; j >= point; j--){ // 뒤에서부터 출력
                        sb.append(arr[j]);
                        if (j != point){
                            sb.append(",");
                        }
                    }
                }
                sb.append("]").append("\n");
            }
        }
        System.out.println(sb); // 출력
    }
}
