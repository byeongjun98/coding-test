class Solution {
    public int[] solution(int[] arr) {
        int arrLen = 1;
        while (arrLen < arr.length) {
            arrLen *= 2;
        }

        int[] answer = new int[arrLen];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}