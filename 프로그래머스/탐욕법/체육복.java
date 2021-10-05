import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] x = {2,4};
        int[] y = {1,3,5};
        System.out.println(solution(5,x,y));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        ArrayList<Integer> arrLost = new ArrayList<>();
        ArrayList<Integer> arrReserve = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i : lost){
            arrLost.add(i);
        }
        for (int j : reserve){
            arrReserve.add(j);
        }

        for (int i=0; i<arrLost.size(); i++){
            for (int j=0; j<arrReserve.size(); j++){
                if (arrLost.get(i) == arrReserve.get(j)){
                    answer +=1;
                    x.add(arrLost.get(i));
                    y.add(arrReserve.get(j));
                }
            }
        }

        if (answer == n){
            return answer;
        }

        for (int i=0; i<x.size(); i++){
            if (arrLost.contains(x.get(i))){
                arrLost.remove(x.get(i));
            }
        }
        for (int j=0; j<y.size(); j++){
            if (arrReserve.contains(y.get(j))){
                arrReserve.remove(y.get(j));
            }
        }
        x.clear();
        y.clear();

        for (int i : arrLost){
            for (int j : arrReserve){
                if (!x.contains(i) && !y.contains(j))
                    if (i == j+1 || i == j-1) {
                        answer += 1;
                        x.add(i);
                        y.add(j);
                    }
            }
        }

        return answer;
    }
}
