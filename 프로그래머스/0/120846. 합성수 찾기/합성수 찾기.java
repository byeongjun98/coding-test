class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (getDivisorsCount(i) >= 3) {
                count++;
            }
        }
        
        return count;
    }
    
    private int getDivisorsCount(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
