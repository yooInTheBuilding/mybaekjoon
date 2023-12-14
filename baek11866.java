package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue1 = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>(1);
        for (int i = 1; i <= N; i++){
            queue1.add(i);
        }
        while (!queue1.isEmpty()){
            for (int i = 0; i < K - 1; i++){
                queue1.add(queue1.poll());
            }
            result.add(queue1.poll());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 0; i < result.size() - 1; i++) {
            sb.append(result.get(i)).append(", ");
        }
        sb.append(result.get(result.size() - 1)).append(">");
        System.out.println(sb);



    }
}
