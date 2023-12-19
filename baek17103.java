package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class baek17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int divN = n / 2;
            ArrayList<Integer> primeToDivN = shifter(1, divN - 1);
            ArrayList<Integer> primeToN = shifter(divN + 1, n);
            int cnt = 0;
            for (int j = 0; j < primeToDivN.size(); j++){
                for (int k = 0; k < primeToN.size(); k++){
                    if (primeToDivN.get(j) + primeToN.get(k) == n){
                        cnt++;
                    }
                }
            }
            BigInteger bigInteger = new BigInteger(String.valueOf(divN));
            if (bigInteger.isProbablePrime(10)){
                cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
    public static ArrayList<Integer> shifter(int m, int n){
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        arr[1] = 0;
        int num = 2;
        while (num <= arr.length - 1){
            if (arr[num] == 0){
                num++;
            }else {
                int mul = 2;
                while (num * mul <= arr.length - 1){
                    arr[num * mul] = 0;
                    mul++;
                }
                num++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = m; i <= n; i++){
            if (arr[i] != 0){
                list.add(i);
            }
        }
        return list;
    }
}
