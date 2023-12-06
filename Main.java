package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		char[] arr1 = new char[s1.length()];
		boolean[] arr2 = new boolean[(arr1.length - (arr1.length % 2))/2];
		int check = 0;
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = s1.charAt(i);
		}
		for (int i = 0; i < (arr1.length - (arr1.length % 2))/2; i++){
			if(s1.charAt(i) == s1.charAt(arr1.length - 1 - i)){
				arr2[i] = true;
			}else {
				arr2[i] = false;
			}
		}
		for (int i = 0; i < arr2.length; i++){
			if (!arr2[i]){
				check++;
			}
		}
		if (check == 0){
			System.out.println(1);
		}else {
			System.out.println(0);
		}




	}




}
