package practice_alone;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s1 = br.readLine();
		st = new StringTokenizer(s1);
		String A = st.nextToken();
		String B = st.nextToken();

		int a = Integer.parseInt(change(A));
		int b = Integer.parseInt(change(B));

		if (a < b){
			System.out.println(b);
		}else {
			System.out.println(a);
		}









	}
	public static String change(String str){
        return String.valueOf(str.charAt(2)) + String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(0));
	}
}
