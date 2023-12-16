package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean run = true;
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        String s1;
        while (run){
            s1 = br.readLine();
            if (s1.equals("0 0")){
                run = false;
            }else {
                st = new StringTokenizer(s1);
                num1.add(Integer.parseInt(st.nextToken()));
                num2.add(Integer.parseInt(st.nextToken()));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num1.size(); i++){
            if (num2.get(i) % num1.get(i) == 0){
                ans.add("factor");
            } else if (num1.get(i) % num2.get(i) == 0) {
                ans.add("multiple");
            }else {
                ans.add("neither");
            }
            System.out.println(ans.get(i));
        }
    }
}
