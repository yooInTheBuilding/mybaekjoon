package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr1 = new int[28];
		int[] arr2 = new int[30];
		boolean[] arr3 = new boolean[30];
		int n;
		for (int i = 0; i < 28; i++){
			n = Integer.parseInt(br.readLine());
			arr1[i] = n;
		}
		for (int i = 0; i < 30; i++){
			arr2[i] = i+1;
		}
		for (int i = 0; i < 30; i++){
			for (int j = 0; j < 28; j++){
                if (arr2[i] == arr1[j]) {
                    arr3[i] = true;
                    break;
                }
			}
		}
		for (int i = 0; i < 30; i++){
			if (!arr3[i]){
				System.out.println(i+1);
			}
		}









	}
}
