package practice_alone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		st = new StringTokenizer(s);
		int[] arr = new int[N];
		int sum = 0;
		int check = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for(int e = 0; e < N; e++){
			if(arr[e] == check) {
				sum++;
			}
		}
		System.out.println(sum);
		}

	}
