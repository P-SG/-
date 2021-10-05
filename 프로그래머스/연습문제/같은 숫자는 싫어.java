import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] x = {1,1,3,3,0,1,1};
        System.out.println(solution(x));
    }

    public static int[] solution(int []arr) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        int x = 0;
        for (int i=0; i< arr.length; i++){
            if (i==0){
                x = arr[i];
                list.add(arr[i]);
                continue;
            }else if (x == arr[i]){
                continue;
            }else {
                x = arr[i];
                list.add(arr[i]);
            }

        }
        answer = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
