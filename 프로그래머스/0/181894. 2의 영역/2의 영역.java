import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = null;
        // 1. 첫 번째 2의 인덱스 찾기
        int first = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                first = i;
                break;
            }
        }

        // 2. 마지막 2의 인덱스 찾기
        int last = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 2){
                last = i;
                break;
            }
        }
        
        // 3. 2가 없으면 [-1] 반환
        if(first == -1){
            return new int[]{-1};
        }
        // 4. first ~ last 구간 배열 만들어서 반환
        answer = new int[last - first + 1];
        for(int i = first; i <= last; i++ ){
            answer[i - first] = arr[i];
        }
        return answer;
    }
}