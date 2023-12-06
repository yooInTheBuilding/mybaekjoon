package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] arr1 = new int[6];
		int[] arr2 = {1, 1, 2, 2, 2, 8};
		String s1 = br.readLine();
		st = new StringTokenizer(s1);
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = arr2[i] - Integer.parseInt(st.nextToken());
			System.out.print(arr1[i] + " ");
		}

	}




}
