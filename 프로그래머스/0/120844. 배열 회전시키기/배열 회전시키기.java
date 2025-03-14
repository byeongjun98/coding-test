import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] result = new int[len];

        if (direction.equals("right")) { // 오른쪽 회전
            result[0] = numbers[len - 1]; // 마지막 원소를 첫 번째 위치로 이동
            for (int i = 1; i < len; i++) {
                result[i] = numbers[i - 1];
            }
        } else if (direction.equals("left")) { // 왼쪽 회전
            result[len - 1] = numbers[0]; // 첫 번째 원소를 마지막 위치로 이동
            for (int i = 0; i < len - 1; i++) {
                result[i] = numbers[i + 1];
            }
        }

        return result;
    }
}
