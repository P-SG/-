
public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int n) {
        String answer ;
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (int i=0; i<n; i++){
            if (flag) {
                sb.append("수");
                flag = false;
            } else {
                sb.append("박");
                flag = true;
            }

        }
        answer = String.valueOf(sb);
        return answer;
    }
}
