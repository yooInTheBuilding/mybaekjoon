package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2630 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] paper = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(cut(paper, 0));

    }
    static int cut(int[][] paper, int cnt){
            int[][] paper1 = new int[paper.length / 2][paper.length / 2];
            int[][] paper2 = new int[paper.length / 2][paper.length / 2];
            int[][] paper3 = new int[paper.length / 2][paper.length / 2];
            int[][] paper4 = new int[paper.length / 2][paper.length / 2];
            boolean bool1 = false;
            for (int i = 0; i < paper1.length; i++) {
                for (int j = 0; j < paper1.length; j++) {
                    paper1[i][j] = paper[i][j];
                    if (paper1[i][j] == 0) {
                        bool1 = true;
                    }
                }
            }
            boolean bool2 = false;
            for (int i = 0; i < paper2.length; i++) {
                for (int j = 0; j < paper2.length; j++) {
                    paper2[i][j] = paper[i][j + paper.length / 2];
                    if (paper2[i][j] == 0) {
                        bool2 = true;
                    }
                }
            }
            boolean bool3 = false;
            for (int i = 0; i < paper3.length; i++) {
                for (int j = 0; j < paper3.length; j++) {
                    paper3[i][j] = paper[i + paper.length / 2][j];
                    if (paper3[i][j] == 0) {
                        bool3 = true;
                    }
                }
            }
            boolean bool4 = false;
            for (int i = 0; i < paper4.length; i++) {
                for (int j = 0; j < paper4.length; j++) {
                    paper4[i][j] = paper[i + paper.length / 2][j + paper.length / 2];
                    if (paper4[i][j] == 0) {
                        bool4 = true;
                    }
                }
            }
            cnt += cut(paper1, cnt);
            cnt += cut(paper2, cnt);
            cnt += cut(paper3, cnt);
            cnt += cut(paper4, cnt);
            return cnt;
    }
}
