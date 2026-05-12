class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num_list_len = num_list.length;
        if(num_list_len >= 11){
            for(int i = 0; i< num_list_len; i++){
                answer += num_list[i];
            } 
        }else{
            answer = 1;
            for(int i = 0; i< num_list_len; i++){
                answer *= num_list[i];
            } 
        }
        return answer;
    }
}