package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class baek4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        boolean run = true;
        String s1;
        while(run){
            s1 = br.readLine();
            if (s1.equals("0 0 0")){
                run = false;
            }else {
                st = new StringTokenizer(s1);
                list1.add(Integer.parseInt(st.nextToken()));
                list2.add(Integer.parseInt(st.nextToken()));
                list3.add(Integer.parseInt(st.nextToken()));
            }

        }
        String[] arrAns = new String[list1.size()];
        for (int i = 0; i < list1.size(); i++){
            if (list1.get(i)*list1.get(i) + list2.get(i)*list2.get(i) == list3.get(i)*list3.get(i) ||
                    list2.get(i)*list2.get(i) + list3.get(i)*list3.get(i) == list1.get(i)*list1.get(i) ||
                            list3.get(i)*list3.get(i) + list1.get(i)*list1.get(i) == list2.get(i)*list2.get(i)){
                arrAns[i] = "right";
            }else {
                arrAns[i] = "wrong";
            }
        }
        for (int i = 0; i < arrAns.length; i++){
            System.out.println(arrAns[i]);
        }

    }
}
