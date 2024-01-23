package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11724 {
    static int[][] arr;
    static boolean[] visited;
    static int count = 0;
    public static void dfs(int start) {
        visited[start] = true;
        for (int i = 1; i < arr.length; i++){
            if (arr[start][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        arr = new int[1001][1001];
        visited = new boolean[1001];
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        for (int i = 1; i <= N; i++){
            if (!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
