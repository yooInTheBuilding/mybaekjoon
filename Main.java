package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		String[] strings1 = new String[T];
		for (int i = 0; i < T; i++){
			strings1[i] = br.readLine();
		}
		int sum = 0;
		String check = null;
		for(int i = 0; i < strings1.length; i++){
			st = new StringTokenizer(strings1[i],"X", false);
			while (st.hasMoreTokens()) {
				check = st.nextToken();
				for (int j = 1; j <= check.length(); j++) {
					sum += j;
				}
			}
			System.out.println(sum);
			sum = 0;
		}




	}
}
