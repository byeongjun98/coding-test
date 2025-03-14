class Solution {
    public int solution(int n) {
        int gcd = gcd(6, n); // 최대공약수(GCD) 계산
        int lcm = (6 * n) / gcd; // 최소공배수(LCM) 계산
        return lcm / 6; // 피자 판 수
    }

    private int gcd(int a, int b) { // 유클리드 호제법을 이용한 최대공약수(GCD) 함수
        return b == 0 ? a : gcd(b, a % b);
    }
}
