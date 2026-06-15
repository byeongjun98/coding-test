class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] imsi = new int[arr.length];
        
        while(true){
            boolean changed = false;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] = arr[i] / 2; 
                    changed = true;
                } else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                    changed = true;
                } else{
                    imsi[i] = arr[i];
                }
            }
            if(!changed){
                break;
            }
            answer++;
        }
        return answer;
    }
}