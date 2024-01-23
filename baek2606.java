package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2606 {
    static int[][] arr;
    static boolean[] visited;
    static int count = 0;
    public static void dfs(int start) {
        visited[start] = true;
        for (int i = 1; i < arr.length; i++){
            if (arr[start][i] == 1 && !visited[i]){
                dfs(i);
                count++;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());
        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < pair; i++){
            String[] temp = br.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        dfs(1);
        System.out.println(count);
    }
}
