class Solution {
    public int solution(int num, int k) {
        int answer = -1; 
        char[] strArray = String.valueOf(num).toCharArray(); 
        
        for (int i = 0; i < strArray.length; i++) {
            if (Character.getNumericValue(strArray[i]) == k) { 
                answer = i + 1;
                break; 
            }
        }
        return answer;
    }
}
