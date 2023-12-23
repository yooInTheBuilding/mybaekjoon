package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class baek1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        Queue<Integer> queue;
        ArrayList<Integer> list;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            queue = new LinkedList<>();
            list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int temp = 0;
            for (int j = 0; j < N; j++){
                temp = Integer.parseInt(st.nextToken());
                queue.add(temp);
                list.add(temp);
            }
            boolean run = true;
            int cnt = 0;
            while (run){
                boolean bool = false;
                for (int j = 0; j < list.size(); j++){
                    if (queue.peek() < list.get(j)) {
                        queue.add(queue.poll());
                        if (M == 0) {
                            M = queue.size() - 1;
                        } else {
                            M--;
                        }
                        bool = true;
                        break;
                    }
                }
                if (!bool){
                    list.remove(queue.poll());
                    if (M == 0){
                        cnt++;
                        run = false;
                    }else {
                        M--;
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
