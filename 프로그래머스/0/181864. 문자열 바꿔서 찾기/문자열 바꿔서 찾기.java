class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String result = myString
                .replace("A", "temp")
                .replace("B", "A")
                .replace("temp", "B");
        if(result.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}