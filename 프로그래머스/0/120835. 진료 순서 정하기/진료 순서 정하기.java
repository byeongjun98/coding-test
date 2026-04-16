import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        // 복사 + 정렬
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        // 정렬 결과 출력
        System.out.println("정렬된 배열: " + Arrays.toString(sorted));
        
        // 큰 값부터 순위 매기기
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        
        for (int i = sorted.length - 1; i >= 0; i--) {
            map.put(sorted[i], rank++);
        }
        
        // map 출력
        System.out.println("순위 map: " + map);
        
        // 원본 기준으로 순위 넣기
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        
        // 결과 출력
        System.out.println("결과 answer: " + Arrays.toString(answer));
        
        return answer;
    }
    
}