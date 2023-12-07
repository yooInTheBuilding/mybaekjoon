package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s1 = br.readLine();
		st = new StringTokenizer(s1);
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		System.out.println((A*A) - (B*B));
	}
}
