package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		char[] arr1 = new char[s1.length()];
		String s2 = "";
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = (s1.charAt(i));
			if (arr1[i] < 97){
				arr1[i] += 32;
			}else {
				arr1[i] -= 32;
			}
		}
		for (int i = 0; i < arr1.length; i++){
			s2 += arr1[i];
		}
		System.out.println(s2);
	}
}
