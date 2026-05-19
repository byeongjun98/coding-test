class Solution {

    public int solution(int balls, int share) {

        long result = 1;

        /*
        조합(Combination) 공식 최적화
        
        nCm = n! / ((n-m)! * m!)
        
        factorial을 직접 계산하면
        30! 같은 큰 수에서 long 범위를 초과할 수 있음.
        
        따라서 곱셈과 나눗셈을 동시에 진행하며 계산
        */

        // 계산 횟수 최소화
        // nCr == nC(n-r)
        if (share > balls - share) {
            share = balls - share;
        }

        for (int i = 0; i < share; i++) {

            // 분자 계산
            result *= (balls - i);

            // 분모 계산
            result /= (i + 1);
        }

        return (int) result;
    }
}