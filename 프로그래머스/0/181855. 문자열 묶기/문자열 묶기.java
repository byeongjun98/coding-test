class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        // 문자열 최대 길이 먼저 구하기
        int maxLen = 0;
        for (String s : strArr) {
            maxLen = Math.max(maxLen, s.length());
        }
        
        int[] groupCount = new int[maxLen + 1]; // 길이 기준으로 배열 생성
        
        for (String s : strArr) {
            groupCount[s.length()] += 1;
            answer = Math.max(answer, groupCount[s.length()]); // 최댓값 갱신
        }
        
        return answer;
    }
}