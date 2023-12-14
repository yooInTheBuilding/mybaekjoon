package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class baek2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < N; i++){
            list1.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list1);

        for (int value : list1){
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}
