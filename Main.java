package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr1 = new int[10];
		boolean[] arr2 = new boolean[42];
		int var1;
		int sum = 0;
		for (int i = 0; i < 10; i++){
			var1 = Integer.parseInt(br.readLine());
			arr1[i] = var1 % 42;
			arr2[arr1[i]] = true;
		}
		for (int i = 0; i < 42; i++){
			if(arr2[i]){
				sum++;
			}
		}
		System.out.println(sum);

	}
}
