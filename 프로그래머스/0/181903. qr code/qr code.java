class Solution {
    public String solution(int q, int r, String code) {
        // String answer = "";
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < code.length(); i++){
            // System.out.println(code.charAt(i));
            if(i % q == r){
                // System.out.println(code.charAt(i));
                answer.append(code.charAt(i));
            }
        }
        return answer.toString();
    }
}