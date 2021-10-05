
public class Solution {
    public static void main(String[] args) {
        String x = "abcde";
        System.out.println(solution(x));
    }

    public static String solution(String s) {
        String answer;
        int x;
        x = s.length()/2;
        if (s.length() % 2 == 1){
            answer = s.substring(x, x + 1);
        }else {
            answer = s.substring(x-1, x+1);
        }
        return answer;
    }
}
