package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekArenaC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        String[][] arr = new String[N][3];
        int[] arr2 = new int[N];
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++){
            st = new StringTokenizer(br.readLine());
            String string = st.nextToken();
            String A = null;
            String B = null;
            if (st.hasMoreTokens()){
                A = st.nextToken();
                B = st.nextToken();
            }
            if (string.equals("1")){
                for (int j = 0; j < N; j++){
                    if (arr[j][1].equals(A)
                            && M >= Long.parseLong(arr[j][2]) * Integer.parseInt(B)){
                        arr2[j] += Integer.parseInt(B);
                        M -= Long.parseLong(arr[j][2]) * Integer.parseInt(B);
                        break;
                    }
                }
            } else if (string.equals("2")) {
                for (int j = 0; j < N; j++){
                    if (arr[j][1].equals(A) && arr2[j] != 0){
                        if (arr2[j] >= Integer.parseInt(B)) {
                            arr2[j] -= Integer.parseInt(B);
                            M += Long.parseLong(arr[j][2]) * Integer.parseInt(B);
                            break;
                        }else {
                            arr2[j] = 0;
                            M += Long.parseLong(arr[j][2]) * arr2[j];
                            break;
                        }
                    }
                }
            } else if (string.equals("3")) {
                for (int j = 0; j < N; j++){
                    if (arr[j][1].equals(A)){
                        arr[j][2] = String.valueOf(Integer.parseInt(arr[j][2]) + Integer.parseInt(B));
                        break;
                    }
                }
            } else if (string.equals("4")) {
                for (int j = 0; j < N; j++){
                    if (arr[j][0].equals(A)){
                        arr[j][2] = String.valueOf(Integer.parseInt(arr[j][2]) + Integer.parseInt(B));
                    }
                }
            } else if (string.equals("5")) {
                for (int j = 0; j < N; j++){
                    if (arr[j][0].equals(A)){
                        int temp = (int)(Double.parseDouble(arr[j][2]) * (100 + Double.parseDouble(B)) / 100);
                        temp -= temp % 10;
                        arr[j][2] = String.valueOf(temp);
                    }
                }
            } else if (string.equals("6")) {
                sb.append(M).append("\n");
            } else if (string.equals("7")) {
                long n = M;
                for (int j = 0; j < N; j++){
                    n += Long.parseLong(arr[j][2]) * arr2[j];
                }
                sb.append(n).append("\n");
            }
        }
        System.out.println(sb);
    }
}
