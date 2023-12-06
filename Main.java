package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		String[] arr1 = new String[T];
		for (int i = 0; i < T; i++){
			arr1[i] = br.readLine();
		}
		for (int i = 0; i < T; i++){
			System.out.println(String.valueOf(arr1[i].charAt(0)) + String.valueOf(arr1[i].charAt(arr1[i].length()-1)));
		}

	}
}
