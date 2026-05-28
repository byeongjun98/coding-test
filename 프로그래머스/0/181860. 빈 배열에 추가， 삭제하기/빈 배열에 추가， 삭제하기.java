import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(flag[i] == true){
                int count = 0;
                while(arr[i] * 2 > count){
                    s1.add(arr[i]);
                    count++;
                }
            } else{
                int count = 0;
                int del = arr[i];
                while(count < del){
                    s1.remove(s1.size() - 1);
                    count++;
                }
                
            }
        }
        int[] answer = new int[s1.size()];
        for(int i = 0; i < s1.size(); i++){
            answer[i] = s1.get(i);
        }        
        return answer;
    }
}