package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2166 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());// 점의 개수
        double[][] arr= new double[N][2];// 좌표
        for (int i = 0; i < N; i++){
            String[] s1 = br.readLine().split(" ");// 좌표 입력
            arr[i][0] = Integer.parseInt(s1[0]);// x좌표
            arr[i][1] = Integer.parseInt(s1[1]);// y좌표
        }
        double sum = 0;// 넓이
        for (int i = 1; i < N - 1; i++){// 삼각형의 개수만큼 반복
            sum += ((arr[i][0] - arr[0][0]) * (arr[i + 1][1] - arr[0][1])// 삼각형의 넓이 구하는 공식
                    - (arr[i + 1][0] - arr[0][0]) * (arr[i][1] - arr[0][1]))/2;
        }
        System.out.printf("%.1f", Math.abs(sum));// 절댓값으로 출력
    }
}
