public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
    }

    public static String solution(String new_id) {
        String answer;

        //1단계
        answer = new_id.toLowerCase();
        //2단계
        answer = answer.replaceAll("[^0-9a-z-_.]", "");
        //3단계
        answer = answer.replaceAll("[.]{2,}", ".");
        //4단계
        answer = answer.replaceAll("^[.]", "");
        answer = answer.replaceAll("[.]$", "");
        //5단계
        if(answer.length() == 0){
            answer = "a";
        }
        //6단계

        if(answer.length() > 15){
            answer = answer.substring(0, 15).replaceAll("[.]$","");
        }
        //7단계
        if(answer.length() < 3){
            while (answer.length() < 3) {
                answer += answer.substring(answer.length() - 1);
            }
        }

        return answer;
    }
}
