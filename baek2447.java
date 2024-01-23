package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2447 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int size = (int) (Math.log(n) / Math.log(3));
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }
        star(n, 0, 0, arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void star(int n, int x, int y, char[][] arr) {
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }
        int div = n / 3;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (!(i == 1 && j == 1)) {
                    star(div, x + div * i, y + div * j, arr);
                }
            }
        }
    }
}
