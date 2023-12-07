package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		String s1;
		int H;
		int W;
		int N;
		int Y;
		int X;
		String[] ans = new String[T];

		for (int i = 0; i < T; i++){
			s1 = br.readLine();
			st = new StringTokenizer(s1);
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			if (N % H != 0){
				Y = N % H;
				X = (N / H) + 1;
			}else {
				Y = H;
				X = N / H;
			}
			if (X < 10){
				ans[i] = Y + "0" + X;
			}else {
				ans[i] = Y + Integer.toString(X);
			}
		}
		for (int i = 0; i < T; i++){
			System.out.println(ans[i]);
		}
	}
}
