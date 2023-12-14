package practice_alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class baek1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean run = true;
        String s1;
        List<String> list1 = new ArrayList<String>();
        List<String> listAns = new ArrayList<String>();
        while(run){
            s1 = br.readLine();
            if (s1.equals("0")){
                run = false;
            }else {
                list1.add(s1);
            }


        }
        int checkFalse = 0;
        for (int i = 0; i < list1.size(); i++){
            for (int j = 0; j < list1.get(i).length()/2; j++){
                if (list1.get(i).charAt(j) != list1.get(i).charAt(list1.get(i).length()-1-j)){
                    checkFalse++;
                }
            }
            if (checkFalse == 0){
                listAns.add("yes");
            }else {
                listAns.add("no");
            }
            checkFalse = 0;
        }
        Iterator<String> It = listAns.iterator();
        while (It.hasNext()){
            System.out.println(It.next());
        }
    }
}
