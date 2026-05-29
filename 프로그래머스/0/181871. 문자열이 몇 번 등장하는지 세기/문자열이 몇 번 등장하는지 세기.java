class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLen = pat.length();
        for(int i = 0; i <= myString.length() - patLen; i++){
            // System.out.println("myString의 " + i + " 번째: " + myString.charAt(i));
            if(myString.substring(i, i + patLen).equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}