package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int newN = (int)Math.pow(2, N);
        int cnt = 0;
        int[] arr= new int[]{newN, r + 1, c + 1, cnt};
        int[] arr2 = method1(arr);
        System.out.println(arr2[3]);

    }
    static int[] method1(int[] arr){
        if (arr[1] > arr[0] / 2){
            if (arr[2] > arr[0] / 2){
                arr[3] += 3 * (arr[0] * arr[0] / 4);
                arr[2] -= arr[0] / 2;
                arr[1] -= arr[0] / 2;
            }else {
                arr[3] += 2 * (arr[0] * arr[0] / 4);
                arr[1] -= arr[0] / 2;
            }
        }else {
            if (arr[2] > arr[0] / 2){
                arr[3] += arr[0] * arr[0]/ 4;
                arr[2] -= arr[0] / 2;
            }
        }
        arr[0]/=2;
        if (arr[0] >= 2){
            method1(arr);
        }
        return arr;
    }
}
