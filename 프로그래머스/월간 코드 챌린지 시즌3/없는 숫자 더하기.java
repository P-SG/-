import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,6,7,8,0};
        System.out.println(solution(x));
    }

    public static int solution(int[] numbers) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int answer = 0;
        HashSet<Integer> map = new HashSet<Integer>();
        for(int i=0; i<numbers.length; i++){
            map.add(numbers[i]);
        }
        for(int j=0; j<arr.length; j++){
            if(!map.contains(arr[j])){
                answer += arr[j];
            }
        }
        return answer;
    }
}
