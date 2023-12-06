package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		String s1 = "";
		while((s1 = br.readLine()) != null && !s1.isEmpty()){
			bw.write(s1 + "\n");
		}
		bw.close();
	}




}
