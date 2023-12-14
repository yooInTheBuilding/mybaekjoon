package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baek11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        matrix[] matrices1 = new matrix[N];
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            matrices1[i] = new matrix(x, y);
        }
        Arrays.sort(matrices1, new Comparator<matrix>() {
            @Override
            public int compare(matrix o1, matrix o2) {
                if (o1.x == o2.x){
                    return o1.y - o2.y;
                }else {
                    return o1.x - o2.x;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            sb.append(matrices1[i]);
        }
        System.out.println(sb);
    }
    public static class matrix{
        int x;
        int y;
        public matrix(int x, int y){
            this.x = x;
            this.y = y;
        }
        public String toString(){
            return x + " " + y + "\n";
        }
    }
}
