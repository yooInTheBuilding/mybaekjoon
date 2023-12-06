package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		String s1;
		int[] arr1 = new int[T];
		String[] arr2 = new String[T];
		String[] arr3 = new String[T];
		for (int i = 0; i < T; i++){
			s1 = br.readLine();
			st = new StringTokenizer(s1);
			arr1[i] = Integer.parseInt(st.nextToken());
			arr2[i] = st.nextToken();
			arr3[i] = "";
		}

		for (int i = 0; i < arr2.length; i++){
			for (int k = 0; k < arr2[i].length(); k++){
				for (int j = 0; j < arr1[i]; j++){
					arr3[i] += arr2[i].charAt(k);
				}
			}
		}
		for (int i = 0; i < T; i++){
			System.out.println(arr3[i]);
		}




	}
}
