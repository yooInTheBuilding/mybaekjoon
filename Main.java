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
		int I;
		int J;
		String s2;
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		for (int i = 0; i < N; i++){
			arr1[i] = i+1;
			arr2[i] = i+1;
		}
		for (int i = 0; i < M; i++){
			s2 = br.readLine();
			st = new StringTokenizer(s2);
			I = Integer.parseInt(st.nextToken());
			J = Integer.parseInt(st.nextToken());
			for (int j = I-1; j <= J-1; j++){
				arr1[j] = arr2[I+J-2-j];
			}
			for (int j = 0; j < N; j++){
				arr2[j] = arr1[j];
			}
		}
		for (int i = 0; i < N; i++){
			System.out.print(arr1[i] + " ");
		}

	}
}
