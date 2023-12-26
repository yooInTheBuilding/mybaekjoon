package practice_alone;

import java.util.LinkedList;
import java.lang.Integer;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 4, 4, 7, 7, 7};
        int[] arr2 = solution(arr);
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

    }
    public static int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < arr.length; i++){
            if(!queue.contains(arr[i])){
                queue.add(arr[i]);
            }
        }

        int[] answer = new int[queue.size()];
        for(int i = 0; i < queue.size(); i++){
            answer[i] = queue.poll();
        }

        return answer;
    }
}
