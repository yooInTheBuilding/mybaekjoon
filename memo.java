package practice_alone;

import java.util.*;

public class memo {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 3, 2, 2, 4};
        System.out.println(solution(nums));
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
    }
    public static int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hashmap.containsKey(nums[i])){
                hashmap.put(nums[i], 1);
            }
        }
        if(hashmap.size() > nums.length / 2){
            answer = nums.length / 2;
        }else{
            answer = hashmap.size();
        }
        return answer;
    }
}
