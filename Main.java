package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s1 = br.readLine();
		st = new StringTokenizer(s1);
		int[] arr1 = new int[8];
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		int ascend = 0;
		int descend = 0;
		for (int i = 1; i < arr1.length; i++){
			if (arr1[i] - arr1[i-1] == 1){
				ascend++;
			} else if (arr1[i] - arr1[i-1] == -1) {
				descend++;
			}
		}
		if (ascend == arr1.length - 1){
			System.out.println("ascending");
		} else if (descend == arr1.length - 1) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}


	}
}
