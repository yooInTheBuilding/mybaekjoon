package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		int sum = 0;
		int[] arr1 = new int[s1.length()];
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = change(s1.charAt(i));
			sum += arr1[i] + 1;
		}
		System.out.println(sum);
	}
	public static char change(char var1){
		if(var1 - 'A' == 0 || var1 - 'A' == 1
			|| var1 - 'A' == 2){
			return 2;
		} else if (var1 - 'A' == 3 || var1 - 'A' == 4
				|| var1 - 'A' == 5) {
			return 3;
		} else if (var1 - 'A' == 6 || var1 - 'A' == 7
				|| var1 - 'A' == 8) {
			return 4;
		} else if (var1 - 'A' == 9 || var1 - 'A' == 10
				|| var1 - 'A' == 11) {
			return 5;
		} else if (var1 - 'A' == 12 || var1 - 'A' == 13
				|| var1 - 'A' == 14) {
			return 6;
		} else if (var1 - 'A' == 15 || var1 - 'A' == 16
				|| var1 - 'A' == 17 || var1 - 'A' == 18) {
			return 7;
		} else if (var1 - 'A' == 19 || var1 - 'A' == 20
				|| var1 - 'A' == 21) {
			return 8;
		} else if (var1 - 'A' == 22 || var1 - 'A' == 23
				|| var1 - 'A' == 24 || var1 - 'A' == 25) {
			return 9;
		}else return var1;
    }



}
