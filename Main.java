package practice_alone;
import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		String s = br.readLine();
		st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		String s2 = br.readLine();
		st = new StringTokenizer(s2);
		for (int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		String result = "";
		for (int i = 0; i < N; i++){
			if (arr[i] < X){
				result += arr[i] + " ";
			}
		}
		bw.write(result);
		bw.close();




	}
}
