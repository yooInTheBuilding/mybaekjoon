package practice_alone;

public class baek4673 {
    static int[] memo = new int[10001];
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++){
            selfNum(i);
        }
        for (int i = 1; i <= 10000; i++){
            if (memo[i] == 0){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    static void selfNum(int i){
        int dI = i;
        while(i > 0){
            dI += i % 10;
            i /= 10;
        }
        if (dI <= 10000){
            memo[dI]++;
        }
    }
}