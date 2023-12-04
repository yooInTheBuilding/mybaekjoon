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
		int[] arr1 = new int[N];
		int I;
		int J;
		int K;
		String s2;
		for (int i = 1; i <= M; i++){
			s2 = br.readLine();
			st = new StringTokenizer(s2);
			I = Integer.parseInt(st.nextToken());
			J = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			for (int j = I-1; j < J; j++){
				arr1[j] = K;
			}
		}
		for (int i = 0; i < N; i++){
			System.out.print(arr1[i] + " ");
		}



	}
}
