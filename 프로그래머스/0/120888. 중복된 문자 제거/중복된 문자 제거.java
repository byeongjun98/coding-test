import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        // LinkedHashSet을 사용하여 중복 제거 및 순서 유지
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : my_string.toCharArray()) {
            set.add(c);
        }

        // 결과 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }

        return sb.toString();
    }
}
