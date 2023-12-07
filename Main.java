package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		String s2 = s1.toUpperCase();
		int[] arr1 = new int[26];
		for (int i = 0; i < s2.length(); i++){
			arr1[s2.charAt(i)-'A']++;
		}
		int max = arr1[0];
		int check = 0;
		String checkA = null;
		for (int i = 0; i < arr1.length; i++){
			if (max < arr1[i]){
				max = arr1[i];
			}
		}
		for (int i = 0; i < arr1.length; i++){
			if (max == arr1[i]){
				check++;
				checkA = String.valueOf((char) (i + 'A'));
			}
		}
		if (check == 1){
			System.out.println(checkA);
		}else {
			System.out.println("?");
		}




	}




}
