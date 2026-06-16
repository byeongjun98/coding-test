class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int count = 0;
            System.out.println(i);
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count % 2 == 0){
                // System.out.println("answer 에 추가된 i: " + i);
                answer += i;
            } else{
                answer -= i;
            }
        }
        return answer;
    }
}