package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //N,M입력
        String s1 = br.readLine();
        st = new StringTokenizer(s1);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //N*M 보드 입력
        String s2;
        String[][] chess = new String[N][M];
        for (int i = 0; i < N; i++){
            s2 = br.readLine();
            for (int j = 0; j < M; j++){
                chess[i][j] = String.valueOf(s2.charAt(j));
            }
        }
        //처음이 White인 8*8체스판 divW
        String[][] divW = new String[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(i % 2 == 0){
                    if (j % 2 ==0){
                        divW[i][j] = "W";
                    }else {
                        divW[i][j] = "B";
                    }
                }else {
                    if (j % 2 == 0){
                        divW[i][j] = "B";
                    }else {
                        divW[i][j] = "W";
                    }
                }
            }
        }
        //처음이 Black인 8*8체스판 divB
        String[][] divB = new String[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(i % 2 == 0){
                    if (j % 2 ==0){
                        divB[i][j] = "B";
                    }else {
                        divB[i][j] = "W";
                    }
                }else {
                    if (j % 2 == 0){
                        divB[i][j] = "W";
                    }else {
                        divB[i][j] = "B";
                    }
                }
            }
        }
        //8*8로 나누어지는 모든 경우 탐색
        int[][] number = new int[N-7][M-7];
        int checkW = 0; //divW기준 바꿔야 하는 칸 개수
        int checkB = 0; //divB기준 바꿔야 하는 칸 개수
        for (int i = 0; i < N - 7; i++){
            for (int j = 0; j < M - 7; j++){
                for (int k = i; k < 8 + i; k++){
                    for (int l = j; l < 8 + j; l++){
                        if(!chess[k][l].equals(divW[k-i][l-j])){ //칸의 색이 다를 경우
                            checkW++; //check를 더함
                        }
                        if(!chess[k][l].equals(divB[k-i][l-j])){
                            checkB++;
                        }
                    }
                }
                if (checkW <= checkB){ //둘 중 더 낮은 값이 최솟값
                    number[i][j] = checkW;
                }else {
                    number[i][j] = checkB;
                }
                checkB = 0; //같은 조건에서 반복하기 위해 초기화
                checkW = 0;
            }
        }
        int min = number[0][0];
        for (int i = 0; i < N - 7; i++){ // 모든 경우의 수에서의 최솟값 탐색
            for (int j = 0; j < M - 7; j++){
                if (min > number[i][j]){
                    min = number[i][j];
                }
            }
        }
        System.out.println(min); //출력
    }
}
