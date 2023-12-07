package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int fac = 1;
		if (N != 0) {
			for (int i = 1; i <= N; i++) {
				fac = fac * i;
			}

		}else {
			fac = 1;
		}
		System.out.println(fac);
	}
}
