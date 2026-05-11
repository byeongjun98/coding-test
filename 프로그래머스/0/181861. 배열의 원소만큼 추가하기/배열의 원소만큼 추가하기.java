class Solution {
    public int[] solution(int[] arr) {
        int answerArrayLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            answerArrayLength += arr[i];
        }
        
        int[] answer = new int[answerArrayLength];
        
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            
            for (int j = 0; j < a; j++) {
                answer[idx] = a;
                idx++;
            }
        }
        
        return answer;
    }
}