package practice_alone;

import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr1 = new int[9];
		for (int i = 0; i < 9; i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}
		int max = arr1[0];
		for (int i = 0; i < 9; i++){
			if(max < arr1[i]){
				max = arr1[i];
			}
		}
		int check = 0;
		for (int i = 0; i < 9; i++){
			if(max == arr1[i]){
				check = i + 1;
			}
		}
		bw.write(String.valueOf(max) + "\n");
		bw.write(String.valueOf(check));

		bw.close();
		

	}
}
