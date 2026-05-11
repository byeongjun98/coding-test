class Solution {
    public int[] solution(String myString) {

        String[] arr = myString.split("x", -1);
        
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
            for(int j = 0; j< arr.length; j++){
            }
        }

        return answer;
    }
}