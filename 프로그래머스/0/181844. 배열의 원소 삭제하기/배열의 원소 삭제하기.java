import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            boolean isDelete = false;

            for(int del : delete_list){
                if(num == del){
                    isDelete = true;
                    break;
                }
            }

            if(!isDelete){
                list.add(num);
                System.out.println(num+"번째"+list);
            }
        }

        // List → 배열 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(i+"번째"+answer[i]);
        }

        return answer;
    }
}