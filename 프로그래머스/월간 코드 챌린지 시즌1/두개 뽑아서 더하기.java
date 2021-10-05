import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] x = {2,1,3,4,1};
        System.out.println(solution(x));
    }

    public static ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        boolean flag = true;
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        int num = 0;
        for (int i : numbers){
            nums.add(i);
        }
        for (int i=0; i< numbers.length; i++) {
            for (int y = 0; y < nums.size(); y++) {
                if (num == 0) {
                    if (flag){
                        if (nums.indexOf(nums.get(y)) == nums.indexOf(nums.get(y))) {
                            num = nums.get(y);
                            flag = false;
                        } else {
                            ans.add(num + nums.get(y));
                        }
                    } else {
                        ans.add(num + nums.get(y));
                    }
                } else {
                    ans.add(num + nums.get(y));
                }
            }
            nums.remove(0);
            num = 0;
            flag = true;
        }

        for (int i : ans){
            if (!answer.contains(i)) {
                answer.add(i);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
