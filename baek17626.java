package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] square = new int[(int)(Math.sqrt(n)) + 1];
        for (int i = 0; i < square.length; i++){
            square[i] = i * i;
        }
        boolean bool = false;
        for (int i = 0; i < square.length; i++){
            if (square[i] == n){
                System.out.println(1);
                bool = true;
                break;
            }
        }
        if (!bool){
            for (int i = 1; i < square.length; i++){
                for (int j = 1; j < square.length; j++){
                    if (square[i] + square[j] == n){
                        System.out.println(2);
                        bool = true;
                        break;
                    }
                }
                if (bool){
                    break;
                }
            }
        }
        if (!bool){
            for (int i = 1; i < square.length; i++){
                for (int j = 1; j < square.length; j++){
                    for (int k = 1; k < square.length; k++) {
                        if (square[i] + square[j] + square[k] == n) {
                            System.out.println(3);
                            bool = true;
                            break;
                        }
                    }
                    if (bool){
                        break;
                    }
                }
                if (bool){
                    break;
                }
            }
        }
        if (!bool){
            for (int i = 1; i < square.length; i++){
                for (int j = 1; j < square.length; j++){
                    for (int k = 1; k < square.length; k++) {
                        for (int l = 1; l < square.length; l++) {
                            if (square[i] + square[j] + square[k] + square[l] == n) {
                                System.out.println(4);
                                bool = true;
                                break;
                            }
                        }
                        if (bool){
                            break;
                        }
                    }
                    if (bool){
                        break;
                    }
                }
                if (bool){
                    break;
                }
            }
        }
    }
}
