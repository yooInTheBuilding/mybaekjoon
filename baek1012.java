package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1012 {
    static int[][] matrix;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1 ,0 ,0};
    static int M;
    static int N;
    static int K;
    static int count = 0;

    public static void dfs(int x, int y){
        visited[x][y] = true;
        for (int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < M && ny >= 0 && ny < N){
                if (matrix[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx, ny);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++){
            count = 0;
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            matrix = new int[M][N];
            visited = new boolean[M][N];
            for (int j = 0; j < K; j++){
                st = new StringTokenizer(br.readLine());
                matrix[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }
            for (int j = 0; j < M; j++){
                for (int k = 0; k < N; k++){
                    if (matrix[j][k] == 1 && !visited[j][k]){
                        dfs(j, k);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
