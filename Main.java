package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		int N = s1.length();
		String s2 = "abcdefghijklmnopqrstuvwxyz";
		String[] arr1 = new String[26];
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = String.valueOf(s2.charAt(i));
		}
		for (int i = 0; i < arr1.length; i++){
			System.out.print(s1.indexOf(arr1[i]) + " ");
		}




	}
}
