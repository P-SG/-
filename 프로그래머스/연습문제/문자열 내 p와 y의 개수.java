import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }

    public static boolean solution(String s) {
        boolean answer;
        String x;
        int countP = 0;
        int countY = 0;
        x = s.toLowerCase(Locale.ROOT);
        for (int i=0; i<s.length(); i++){
            if (x.charAt(i) == 'p'){
                countP += 1;
            } else if (x.charAt(i) == 'y'){
                countY += 1;
            }
        }
        answer = countP == countY ? true : false;

        return answer;
    }
}
