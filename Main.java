package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s1 = br.readLine();
		st = new StringTokenizer(s1);
		long N = Integer.parseInt(st.nextToken());
		long M = Integer.parseInt(st.nextToken());
		if ((N - M) < 0){
			System.out.println(-(N-M));
		}else {
			System.out.println(N - M);
		}


	}
}
