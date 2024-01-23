package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek14940 {
    static int[][] arr;
    static int[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1 ,0 ,0};
    static int N, M;

    public static void bfs(int x, int y) {
    	for (int i = 0; i < 4; i++) {
    		int nx = x + dx[i];
    		int ny = y + dy[i];
    		if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
    			if (arr[nx][ny] == 1 && visited[nx][ny] == 0) {
    				visited[nx][ny] = visited[x][y] + 1;
    				bfs(nx, ny);
    			}
    		}
    	}
    }
    public static void main(String[] args) throws IOException {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	StringTokenizer st;
        	st = new StringTokenizer(br.readLine());
        	N = Integer.parseInt(st.nextToken());
        	M = Integer.parseInt(st.nextToken());
        	arr = new int[N][M];
        	visited = new int[N][M];
        	int x = 0, y = 0;
        	for (int i = 0; i < N; i++) {
        		st = new StringTokenizer(br.readLine());
        		for (int j = 0; j < M; j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        			if (arr[i][j] == 2) {
        				x = i;
        				y = j;
        			}
        		}
        	}
        	bfs(x, y);
        	StringBuilder sb = new StringBuilder();
        	for (int i = 0; i < N; i++) {
        		for (int j = 0; j < M; j++) {
        			if (arr[i][j] == 0) {
        				sb.append("0 ");
        			} else if (arr[i][j] == 2) {
        				sb.append("0 ");
        			} else {
        				if (visited[i][j] == 0) {
        					sb.append("-1 ");
        				} else {
        					sb.append(visited[i][j] - 1).append(" ");
        				}
        			}
        		}
        		sb.append("\n");
        	}
        	System.out.println(sb);
    }
}
