import java.util.Map;

class Solution {
    public String solution(String letter) {
        // 모스부호 딕셔너리
        Map<String, Character> morse = Map.ofEntries(
            Map.entry(".-", 'a'), Map.entry("-...", 'b'), Map.entry("-.-.", 'c'),
            Map.entry("-..", 'd'), Map.entry(".", 'e'), Map.entry("..-.", 'f'),
            Map.entry("--.", 'g'), Map.entry("....", 'h'), Map.entry("..", 'i'),
            Map.entry(".---", 'j'), Map.entry("-.-", 'k'), Map.entry(".-..", 'l'),
            Map.entry("--", 'm'), Map.entry("-.", 'n'), Map.entry("---", 'o'),
            Map.entry(".--.", 'p'), Map.entry("--.-", 'q'), Map.entry(".-.", 'r'),
            Map.entry("...", 's'), Map.entry("-", 't'), Map.entry("..-", 'u'),
            Map.entry("...-", 'v'), Map.entry(".--", 'w'), Map.entry("-..-", 'x'),
            Map.entry("-.--", 'y'), Map.entry("--..", 'z')
        );

        // 모스부호를 공백(" ") 기준으로 나누기
        String[] morseArray = letter.split(" ");
        
        // 변환된 문자열을 저장할 StringBuilder
        StringBuilder decoded = new StringBuilder();
        
        // 배열을 순회하며 모스부호를 영어로 변환
        for (String morseCode : morseArray) {
            decoded.append(morse.get(morseCode));
        }
        
        // 변환된 문자열 반환
        return decoded.toString();
    }
}
