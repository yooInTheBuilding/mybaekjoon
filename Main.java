package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
		StringTokenizer st;
		st = new StringTokenizer(s1);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr1 = new int[N];
		int I;
		int J;
		int originI;
		int originJ;
		String s2;
		for (int i = 0; i < N; i++){
			arr1[i] = i + 1;
		}
		for (int i = 0; i < M; i++){
			s2 = br.readLine();
			st = new StringTokenizer(s2);
			I = Integer.parseInt(st.nextToken());
			J = Integer.parseInt(st.nextToken());
			originI = arr1[I-1];
			originJ = arr1[J-1];
			arr1[I-1] = originJ;
			arr1[J-1] = originI;
		}
		for (int i = 0; i < N; i++){
			System.out.print(arr1[i] + " ");
		}





	}
}
