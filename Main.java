package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s1 = br.readLine();
		st = new StringTokenizer(s1);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String s2;
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] ans = new int[N][M];
		for (int i = 0; i < N; i++){
			s2 = br.readLine();
			st = new StringTokenizer(s2);
			for (int j = 0; j < M; j++){
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++){
			s2 = br.readLine();
			st = new StringTokenizer(s2);
			for (int j = 0; j < M; j++){
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++){
			for (int j = 0; j < M; j++){
				ans[i][j] = A[i][j] + B[i][j];
				System.out.print(ans[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
