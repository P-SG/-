import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }

    public static int solution(String s) {
        String list[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String  nList[] = {"0","1","2","3","4","5","6","7","8","9"};
        HashMap<String, String > map = new HashMap<>();
        String x = s;
        int answer;
        for(int i=0; i<list.length; i++){
            map.put(list[i],nList[i]);
        }
        for (String key : map.keySet()){
            if (x.contains(key)) {
                x = x.replaceAll(key,map.get(key));
            }
        }

        answer = Integer.parseInt(x);
        return answer;
    }
}
