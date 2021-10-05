import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] x = {5, 9, 7, 10};
        for (int i : solution(x,5)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr){
            if (i % divisor == 0){
                list.add(i);
            }
        }
        if (list.size() != 0){
            answer = new int[list.size()];
            for (int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        Arrays.sort(answer);
        return answer;
    }
}
