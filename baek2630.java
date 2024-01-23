package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2630 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[n][n];
        for (int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < n; j++){
                paper[i][j] = Integer.parseInt(temp[j]);
            }
        }
        int[] count = new int[2];
        cut(paper, count, 0, 0, n);
        System.out.println(count[0]);
        System.out.println(count[1]);
    }
    public static void cut(int[][] paper, int[] count, int x, int y, int n) {
        if (n == 1) {
            count[paper[x][y]]++;
            return;
        }
        boolean bool = true;
        int temp = paper[x][y];
        for (int i = x; i < x + n; i++){
            for (int j = y; j < y + n; j++){
                if (temp != paper[i][j]){
                    bool = false;
                    break;
                }
            }
            if (!bool){
                break;
            }
        }
        if (bool){
            count[temp]++;
        }else {
            cut(paper, count, x, y, n / 2);
            cut(paper, count, x + n / 2, y, n / 2);
            cut(paper, count, x, y + n / 2, n / 2);
            cut(paper, count, x + n / 2, y + n / 2, n / 2);
        }
    }
}
