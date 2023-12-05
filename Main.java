package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		double[] arr1 = new double[N];
		double max;
		double sum = 0;
		String s1 = br.readLine();
		st = new StringTokenizer(s1);
		for (int i = 0; i < N; i++){
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		max = arr1[0];
		for (int i = 0; i < N; i++){
			if (max < arr1[i]){
				max = arr1[i];
			}
		}
		for (int i = 0; i < N; i++){
			arr1[i] = (arr1[i]/max) * 100;
			sum += arr1[i];
		}
		System.out.println(sum/N);




	}
}
