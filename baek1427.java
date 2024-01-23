package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();// 숫자 입력
        int[] arr = new int[s1.length()];// 숫자를 담을 배열
        for (int i = 0; i < s1.length(); i++){
            arr[i] = s1.charAt(i) - '0';
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] < arr[j + 1]){ // 버블정렬
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }else if (arr[j] == arr[j + 1]){
                    continue;
                }
            }
        }
        StringBuilder sb = new StringBuilder();// 출력할 문자열
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
