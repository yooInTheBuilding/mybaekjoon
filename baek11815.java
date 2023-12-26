package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek11815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            arr[i] = Long.parseLong(st.nextToken());
            long ans = binarySearch(arr[i]);
            System.out.println("ans = " + ans);
            if (ans != -1){
                sb.append("1").append(" ");
            }else {
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb);
    }
    public static long binarySearch(long num){
        long low = 1L;
        long high = 1000000000000000000L;
        while (low <= high){
            long mid = low + (high - low)/2;
            if (mid * mid == num){
                return mid;
            } else if (mid * mid > num) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
