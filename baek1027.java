package practice_alone;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] buildings = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            buildings[i] = Integer.parseInt(st.nextToken());
        }

        int maxCount = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i - 1; j >= 0; j--) {
                boolean canSee = true;
                for (int k = j + 1; k < i; k++) {
                    if ((double)(buildings[i] - buildings[j]) / (i - j) <= (double)(buildings[k] - buildings[j]) / (k - j)) {
                        canSee = false;
                        break;
                    }
                }
                if (canSee) count++;
            }
            for (int j = i + 1; j < N; j++) {
                boolean canSee = true;
                for (int k = i + 1; k < j; k++) {
                    if ((double)(buildings[j] - buildings[i]) / (j - i) <= (double)(buildings[k] - buildings[i]) / (k - i)) {
                        canSee = false;
                        break;
                    }
                }
                if (canSee) count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }
}
