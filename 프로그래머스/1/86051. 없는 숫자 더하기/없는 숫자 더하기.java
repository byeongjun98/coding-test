import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int hap = 0;
        for(int i =0; i < numbers.length; i++ ){
            hap += numbers[i];
        }
        // 0~9 까지의 합(45)에서 numbers 의 요소들의 합을 빼면 될듯?
        answer = 45 - hap;
        return answer;
    }
}