package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baek11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N != 1) {
            ArrayList<Integer> divisor = new ArrayList<>();
            boolean run = true;
            boolean check = false;
            while (run) {
                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) {
                        N /= i;
                        divisor.add(i);
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    run = false;
                }
                check = false;
            }
            divisor.add(N);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < divisor.size(); i++) {
                sb.append(divisor.get(i)).append("\n");
            }
            System.out.println(sb);
        }
    }
}
