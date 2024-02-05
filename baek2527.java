package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2527 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++){
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[8];
            for (int j = 0; j < 8; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            sb.append(
                    logic(
                            arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]
                    )
            ).append("\n");
        }
        System.out.println(sb);
    }
    public static String logic(
            int x1, int y1, int p1, int q1,
            int x2, int y2, int p2, int q2){
        if (p1 < x2){
            return "d";
        } else if (p1 == x2) {
            if (q1 < y2){
                return "d";
            } else if (q1 == y2) {
                return "c";
            } else if (q1 > y2 && q1 < q2) {
                return "b";
            } else if (q1 == q2) {
                return "b";
            }else {
                if (y1 < q2){
                    return "b";
                } else if (y1 == q2) {
                    return "c";
                }else {
                    return "a";
                }
            }
        } else if (p1 > x2 && p1 < p2) {
            if (q1 < y2){
                return "d";
            } else if (q1 == y2) {
                return "b";
            } else if (q1 > y2 && q1 < q2) {
                return "a";
            } else if (q1 == q2) {
                return "a";
            }else {
                if (y1 < q2){
                    return "a";
                } else if (y1 == q2) {
                    return "b";
                }else {
                    return "d";
                }
            }
        } else if (p1 == p2) {
            if (q1 < y2){
                return "d";
            } else if (q1 == y2) {
                return "b";
            } else if (q1 > y2 && q1 < q2) {
                return "a";
            } else if (q1 == q2) {
                return "a";
            }else {
                if (y1 < q2){
                    return "a";
                } else if (y1 == q2) {
                    return "b";
                }else {
                    return "d";
                }
            }
        }else {
            if (x1 < p2){
                if (q1 < y2){
                    return "d";
                } else if (q1 == y2) {
                    return "b";
                } else if (q1 > y2 && q1 < q2) {
                    return "a";
                } else if (q1 == q2) {
                    return "a";
                }else {
                    if (y1 < q2){
                        return "a";
                    } else if (y1 == q2) {
                        return "b";
                    }else {
                        return "d";
                    }
                }
            } else if (x1 == p2) {
                if (q1 < y2){
                    return "d";
                } else if (q1 == y2) {
                    return "c";
                } else if (q1 > y2 && q1 < q2) {
                    return "b";
                } else if (q1 == q2) {
                    return "b";
                }else {
                    if (y1 < q2){
                        return "b";
                    } else if (y1 == q2) {
                        return "c";
                    }else {
                        return "d";
                    }
                }
            }else {
                return "d";
            }
        }
    }
}
