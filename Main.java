package practice_alone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String s1 = "";
		String s2 = "";
		
		
		for(int i = 1; i <= N; i++) {
			s1 += "*";
			for(int j = 1; j <= N - i; j++) {
				s2 += " ";
			}
			
			bw.write(s2);
			bw.write(s1 + "\n");
			s2 = "";
		}
		bw.close();
		
	}

}
