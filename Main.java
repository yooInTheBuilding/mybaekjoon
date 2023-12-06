package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String s1 = br.readLine();
		int[] arr1 = new int[N];
		int sum = 0;
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = s1.charAt(i) - '0';
		}

		for (int i = 0; i < arr1.length; i++){
			sum += arr1[i];
		}

		System.out.println(sum);



	}
}
