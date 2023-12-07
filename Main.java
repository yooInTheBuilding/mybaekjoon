package practice_alone;
import java.io.*;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[][] grade = new double[4][3];
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 3; j++){
				grade[i][j] = 3.7 + (0.3 * (2 - j)) - i;
			}
		}
		String[][] gradeS = new String[4][3];
		String sign = null;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 3; j++){
				if (j == 0){
					sign = "+";
				} else if (j == 1) {
					sign = "0";
				}else {
					sign = "-";
				}
				gradeS[i][j] = (char)(65 + i) + sign;
			}
		}
		String s1 = br.readLine();
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 3; j++){
				if (s1.equals(gradeS[i][j])){
					System.out.println(grade[i][j]);
				}
			}
		}
		if (s1.equals("F")){
			System.out.println("0.0");
		}

	}
}
