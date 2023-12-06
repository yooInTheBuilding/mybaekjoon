package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s1 = "";
		for (int i = 1; i <= N; i++){
			for (int j = 1; j <= N - i; j++){
				s1 += " ";
			}
			for (int j = 1; j <= 2*i - 1; j++){
				s1 += "*";
			}
			System.out.println(s1);
			s1 = "";
		}
		for (int i = 1; i <= N - 1; i++){
			for (int j = 1; j <= i; j++){
				s1 += " ";
			}
			for (int j = 1; j <= (2 * N - 1) - (2 * i); j++){
				s1 += "*";
			}
			System.out.println(s1);
			s1 = "";
		}

	}




}
