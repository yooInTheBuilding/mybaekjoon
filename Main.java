package practice_alone;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import  java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String s1 = br.readLine();
		StringTokenizer st;
		st = new StringTokenizer(s1);
		int[] arr1 = new int[N];

		for (int i = 0; i < N; i++){
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		int max = arr1[0];
		int min = arr1[0];
		for(int i = 0; i < N; i++){
			if(max < arr1[i]){
				max = arr1[i];
			}
			if(min > arr1[i]){
				min = arr1[i];
			}
		}

		System.out.println(min + " " + max);

	}
}
