import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        // 배열값 전부 -1 로 초기화
        Arrays.fill(answer, -1);
        // 해시 셋은 중복은 무시함
        Set<Integer> seen = new HashSet<>();
        
        int idx = 0;   
        for (int i = 0; i < arr.length; i++) {
            // 명시적으로 해시셋에 arr의 i 번째 인덱스와 값을 비교함. 사실 해시셋이 알아서 해줄듯?
            if (!seen.contains(arr[i]) && idx < k) {
                answer[idx] = arr[i];   
                idx++;                  
                seen.add(arr[i]);
            }
        }
        return answer;
    }
}