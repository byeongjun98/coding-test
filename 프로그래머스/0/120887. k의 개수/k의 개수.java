class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = String.valueOf(k); // k를 문자열로 변환

        for (int a = i; a <= j; a++) {
            String strA = String.valueOf(a); // 숫자를 문자열로 변환
            for (char c : strA.toCharArray()) {
                if (String.valueOf(c).equals(kStr)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
