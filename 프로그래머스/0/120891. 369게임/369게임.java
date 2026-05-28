class Solution {
    public int solution(int order) {
        int answer = 0;
        String StringOrder = String.valueOf(order);
        System.out.println(StringOrder.charAt(0));
        for(int i = 0; i < StringOrder.length(); i++){
            if(StringOrder.charAt(i) == '3' || StringOrder.charAt(i) == '6' || StringOrder.charAt(i) == '9' ){
                answer++;
            }
        }
        
        return answer;
    }
}