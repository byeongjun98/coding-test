import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // 숫자의 등장 횟수를 카운트
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;  // 최빈값의 빈도 수
        int mode = -1;    // 최빈값
        boolean multiple = false; // 최빈값이 여러 개인지 여부

        // 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if (count > maxFreq) {
                maxFreq = count;
                mode = num;
                multiple = false; // 새로운 최빈값이 등장했으므로 초기화
            } else if (count == maxFreq) {
                multiple = true; // 최빈값이 여러 개면 true 설정
            }
        }

        return multiple ? -1 : mode;
    }
}
