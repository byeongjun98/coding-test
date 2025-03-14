class Solution {
    public String solution(int age) {
        // 변환할 알파벳 배열
        char[] mapping = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        // 결과 저장용 StringBuilder
        StringBuilder result = new StringBuilder();

        // age를 문자열로 변환하여 각 숫자를 대응하는 알파벳으로 치환
        for (char digit : String.valueOf(age).toCharArray()) {
            result.append(mapping[digit - '0']); // 숫자 -> 알파벳 변환
        }

        return result.toString();
    }
}