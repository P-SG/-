import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] x = {4,3,2,1};
        for (int i : solution(x)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr) {
        int[] answer;
        int num = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length <= 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        for (int i : arr){
            list.add(i);
        }

        for (int i : list){
            if (num > i){
                num = i;
            }
        }
        list.remove(list.indexOf(num));
        answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
