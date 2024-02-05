package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        double low = 0;
        double high = Math.min(x, y);
        double mid = 0;

        while (Math.abs(high - low) > 0.000001) {
            mid = (low + high) / 2.0;
            double d = mid;
            double h1 = Math.sqrt(x * x - d * d);
            double h2 = Math.sqrt(y * y - d * d);
            double h = (h1 * h2) / (h1 + h2);

            if (h > c) {
                low = mid;
            } else {
                high = mid;
            }
        }

        System.out.printf("%.3f\n", mid);
    }
}
