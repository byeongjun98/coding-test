import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (int n : arr) {
            if (n % divisor == 0) {
                result.add(n);
            }
        }
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}