
public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(3,5));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        int x = Math.min(a, b);
        int y = Math.max(a, b);
        for (int i = x; i < y + 1; i++) {
            answer += i;
        }

        return answer;
    }
}
