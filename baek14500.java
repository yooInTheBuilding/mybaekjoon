package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek14500 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int[][] board = new int[N][M];
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j + 3 < M; j++){
                int sum = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i][j + 3];
                if (sum > max){
                    max = sum;
                }
            }
        }
        for (int i = 0; i < M; i++){
            for (int j = 0; j + 3 < N; j++){
                int sum = board[j][i] + board[j + 1][i] + board[j + 2][i] + board[j + 3][i];
                if (sum > max){
                    max = sum;
                }
            }
        }
        for (int i = 0; i + 1 < N; i++){
            for (int j = 0; j + 1 < M; j++){
                int sum = board[i][j] + board[i + 1][j] + board[i][j + 1] + board[i + 1][j + 1];
                if (sum > max){
                    max = sum;
                }
            }
        }
        for (int i = 0; i + 2 < N; i++) {
            for (int j = 0; j + 1 < M; j++) {
                int sum1 = board[i][j] + board[i + 1][j] + board[i + 2][j] + board[i][j + 1];
                int sum2 = board[i][j] + board[i + 1][j] + board[i + 2][j] + board[i + 2][j + 1];
                int sum3 = board[i][j] + board[i][j + 1] + board[i + 1][j + 1] + board[i + 2][j + 1];
                int sum4 = board[i + 2][j] + board[i + 2][j + 1] + board[i + 1][j + 1] + board[i][j + 1];
                int sum5 = board[i][j + 1] + board[i + 1][j] + board[i + 1][j + 1] + board[i + 2][j];
                int sum6 = board[i][j] + board[i + 1][j] + board[i + 1][j + 1] + board[i + 2][j];
                int sum7 = board[i][j] + board[i + 1][j] + board[i + 1][j + 1] + board[i + 2][j + 1];
                int sum8 = board[i][j + 1] + board[i + 1][j] + board[i + 1][j + 1] + board[i + 2][j + 1];
                if (sum1 > max) {
                    max = sum1;
                }
                if (sum2 > max) {
                    max = sum2;
                }
                if (sum3 > max) {
                    max = sum3;
                }
                if (sum4 > max) {
                    max = sum4;
                }
                if (sum5 > max) {
                    max = sum5;
                }
                if (sum6 > max) {
                    max = sum6;
                }
                if (sum7 > max) {
                    max = sum7;
                }
                if (sum8 > max) {
                    max = sum8;
                }
            }
        }
        for (int i = 0; i + 1 < N; i++){
            for (int j = 0; j + 2 < M; j++){
                int sum1 = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i + 1][j + 2];
                int sum2 = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i + 1][j];
                int sum3 = board[i][j] + board[i + 1][j] + board[i + 1][j + 1] + board[i + 1][j + 2];
                int sum4 = board[i][j + 2] + board[i + 1][j] + board[i + 1][j + 1] + board[i + 1][j + 2];
                int sum5 = board[i][j] + board[i][j + 1] + board[i + 1][j + 1] + board[i + 1][j + 2];
                int sum6 = board[i + 1][j] + board[i][j + 1] + board[i + 1][j + 1] + board[i + 1][j + 2];
                int sum7 = board[i + 1][j] + board[i][j + 1] + board[i + 1][j + 1] + board[i][j + 2];
                int sum8 = board[i][j] + board[i][j + 1] + board[i + 1][j + 1] + board[i][j + 2];
                if (sum1 > max){
                    max = sum1;
                }
                if (sum2 > max){
                    max = sum2;
                }
                if (sum3 > max){
                    max = sum3;
                }
                if (sum4 > max){
                    max = sum4;
                }
                if (sum5 > max){
                    max = sum5;
                }
                if (sum6 > max){
                    max = sum6;
                }
                if (sum7 > max){
                    max = sum7;
                }
                if (sum8 > max){
                    max = sum8;
                }
            }
        }
        System.out.println(max);
    }
}
