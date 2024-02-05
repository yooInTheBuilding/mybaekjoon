package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double xA = Integer.parseInt(st.nextToken());
        double yA = Integer.parseInt(st.nextToken());
        double xB = Integer.parseInt(st.nextToken());
        double yB = Integer.parseInt(st.nextToken());
        double xC = Integer.parseInt(st.nextToken());
        double yC = Integer.parseInt(st.nextToken());

        if ((xA - xB) * (yB - yC) == (xB - xC) * (yA - yB)) {
            System.out.println(-1);
        } else {
            double lineAB = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
            double lineBC = Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));
            double lineCA = Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2));
            double max = Math.max(lineAB, Math.max(lineBC, lineCA));
            double min = Math.min(lineAB, Math.min(lineBC, lineCA));
            System.out.println(2 * (max + min));
        }
    }
}
