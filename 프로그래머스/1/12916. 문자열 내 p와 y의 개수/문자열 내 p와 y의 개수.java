class Solution {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;

        s = s.toLowerCase();

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'p'){
                countP++;
            } else if(arr[i] == 'y'){
                countY++;
            }
        }

        return countP == countY;
    }
}