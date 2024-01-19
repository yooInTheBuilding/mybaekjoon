package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek20529 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            if (N > 32) {
                System.out.println(0);
                continue;
            }
            String[] arr = new String[N];
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                arr[j] = st.nextToken();
            }
            for (int j = 0; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        int cnt = 0;
                        for (int m = 0; m < 4; m++) {
                            if (arr[j].charAt(m) != arr[k].charAt(m)) {
                                cnt++;
                            }
                        }
                        for (int m = 0; m < 4; m++) {
                            if (arr[k].charAt(m) != arr[l].charAt(m)) {
                                cnt++;
                            }
                        }
                        for (int m = 0; m < 4; m++) {
                            if (arr[l].charAt(m) != arr[j].charAt(m)) {
                                cnt++;
                            }
                        }
                        if (min > cnt) {
                            min = cnt;
                        }
                        if (min == 0) {
                            break;
                        }
                    }
                }
            }
            System.out.println(min);
        }
    }
}
