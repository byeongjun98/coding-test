class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string.substring(0,n)); 
        return answer.toString();
    }
}