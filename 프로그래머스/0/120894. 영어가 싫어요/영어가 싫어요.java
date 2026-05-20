class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        StringBuilder ans = new StringBuilder();
        
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < eng.length; i++){
            numbers = numbers.replace(eng[i], String.valueOf(i));        
        }
        
        System.out.println(numbers);
        
        return Long.parseLong(numbers);
    }
}