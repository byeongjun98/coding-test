class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int result = 0;
        
        if(len1 < len2){
            result = -1;
        }else if(len2 < len1){
            result = 1;
        }else{
            int arr1Sum = 0;
            int arr2Sum = 0;
            for(int i = 0; i < arr1.length; i++){
                arr1Sum += arr1[i];
                arr2Sum += arr2[i];
            }
            // System.out.println("arr1Sum= " + arr1Sum);
            // System.out.println("arr2Sum= " + arr2Sum);
            if(arr1Sum < arr2Sum){
                result = -1;
            } else if (arr2Sum < arr1Sum){
                result = 1;
            } else{
                result = 0;
            }
        }
        return result;
    }
}