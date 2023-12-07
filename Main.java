package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int sum = 0;
		String s1 = br.readLine();
		st = new StringTokenizer(s1);
		double[] arr1 = new double[5];
		for (int i = 0; i < arr1.length; i++){
			arr1[i] = Math.pow(Integer.parseInt(st.nextToken()), 2);
			sum += (int) arr1[i];
		}
		System.out.println(sum % 10);





	}




}
