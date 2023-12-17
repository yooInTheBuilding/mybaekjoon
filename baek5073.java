package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baek5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        boolean run = true;
        String str;

        while (run){
            str = br.readLine();
            if (str.equals("0 0 0")){
                run = false;
            }else {
                st = new StringTokenizer(str);
                list1.add(Integer.parseInt(st.nextToken()));
                list2.add(Integer.parseInt(st.nextToken()));
                list3.add(Integer.parseInt(st.nextToken()));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list1.size(); i++){
            if (list1.get(i) + list2.get(i) <= list3.get(i)
            || list2.get(i) + list3.get(i) <= list1.get(i)
            || list3.get(i) + list1.get(i) <= list2.get(i)){
                sb.append("Invalid").append("\n");
            }else {
                if (list1.get(i) == list2.get(i) && list2.get(i) == list3.get(i)){
                    sb.append("Equilateral").append("\n");
                } else if (list1.get(i) == list2.get(i)
                || list2.get(i) == list3.get(i)
                || list3.get(i) == list1.get(i)) {
                    sb.append("Isosceles").append("\n");
                }else {
                    sb.append("Scalene").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
