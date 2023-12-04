package practice_alone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int a;
		int b;
		int sum;
		String n;
		while((n = br.readLine()) != null){
			st = new StringTokenizer(n);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum = a + b;
			bw.write(sum + "\n");
			}
		bw.close();
		}

	}
