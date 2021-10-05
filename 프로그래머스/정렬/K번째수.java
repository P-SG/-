import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] x = {1, 5, 2, 6, 3, 7, 4};
        int[][] y = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution(x,y));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] sortA;
        int len = commands.length;
        int[] answer = new int[len];
        for(int i=0; i<len; i++){
            sortA = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(sortA);
            answer[i] = sortA[commands[i][2]-1];
        }
        return answer;
    }
}
