package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		String s1 = Integer.toString(A * B * C);
		int[] arr1 = new int[s1.length()];
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = Integer.parseInt(String.valueOf(s1.charAt(i)));

		}
		int[] arr2 = new int[10];
		for (int i = 0; i < arr2.length; i++){
			for (int j = 0; j < arr1.length; j++){
				if (i == arr1[j]){
					arr2[i]++;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++){
			System.out.println(arr2[i]);
		}



	}




}
