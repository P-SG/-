import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String[] x = {"leo", "kiki", "eden"};
        String[] y = {"eden", "kiki"};
        System.out.println(solution(x,y));
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for(String player : participant){
            int count = 0;
            Integer value =result.get(player);
            if(value != null){
                count = value;
            }
            result.put(player, ++count);
        }
        for(String player : completion){
            int count = result.get(player);
            if(count == 1){
                result.remove(player);
            }else{
                result.put(player, --count);
            }
        }

        String answer = result.keySet().iterator().next();
        return answer;
    }
}
