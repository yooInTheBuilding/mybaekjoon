package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baek2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean run = true;
        boolean run2;
        int i = 1;
        int j;
        int sum = 0;
        int ans = 0;
        List<Integer> list1 = new ArrayList<Integer>();
        while(run && i < N){
            run2 = true;
            j = 10;
            sum = 0;
            ans = i;
            while(run2){
                if(i / j == 0){
                    if (i >= 10){
                        list1.add((i % j)/(j/10));
                        run2 = false;
                    }else {
                        list1.add(i);
                        run2 = false;
                    }
                }else {
                    list1.add((i % j)/(j/10));
                    i -= (i % j)/(j/10);
                }

                j *= 10;
            }
            for (int k = 0; k < list1.size(); k++){
                sum += list1.get(k);
            }
            sum += ans;
            if (sum == N){
                run = false;
            }

            list1.clear();
            i = ans;
            i++;
        }
        if(sum != N) {
            System.out.println(0);
        }
        else {
            System.out.println(ans);
            }
        }
    }
