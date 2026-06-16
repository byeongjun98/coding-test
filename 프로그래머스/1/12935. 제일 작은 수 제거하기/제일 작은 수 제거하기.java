import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length <= 1){
            return new int[]{-1};
        }
        
        int[] answer = new int[arr.length - 1];
        
        int min = arr[0];
        
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        boolean removed = false;
        
        for (int n : arr) {
            if (n == min && !removed) {
                removed = true;     // 최솟값 첫 등장 → 건너뛰고, 뺐다고 표시
            } else {
                result.add(n);
            }
        }
        
        for(int j = 0; j < result.size(); j++ ){
            answer[j] = result.get(j);
        }
        
        return answer;
    }
}