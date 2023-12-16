package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baek9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> divisor;
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb;
        boolean run = true;
        int sum = 0;
        String s1;
        while (run){
            s1 = br.readLine();
            if (s1.equals("-1")){
                run = false;
            }else {
                num.add(Integer.parseInt(s1));
            }
        }
        for (int j = 0; j < num.size(); j++){
            divisor = new ArrayList<>();
            sum = 0;
            for (int k = 1; k < num.get(j); k++){
                if (num.get(j) % k == 0){
                    divisor.add(k);
                    sum += k;
                }
            }
            if (sum == num.get(j)){
                sb = new StringBuilder();
                sb.append(num.get(j)).append(" = ");
                for (int k = 0; k < divisor.size() - 1; k++){
                    sb.append(divisor.get(k)).append(" + ");
                }
                sb.append(divisor.get(divisor.size() - 1));
                ans.add(String.valueOf(sb));
            }else {
                ans.add(num.get(j) + " is NOT perfect.");
            }
        }
        sb = new StringBuilder();
        for (int i = 0; i < ans.size(); i++){
            sb.append(ans.get(i)).append("\n");
        }
        System.out.println(sb);

    }
}
