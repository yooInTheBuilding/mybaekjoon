package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		int i = Integer.parseInt(br.readLine());

		System.out.println(s1.charAt(i - 1));




	}
}
