class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < signs.length; i++){
            if(signs[i] == true){
                answer += absolutes[i];
                // System.out.println("true 임.");
            } else{
                answer -= absolutes[i];
                // System.out.println("false 임.");
            }
        }
        return answer;
    }
}