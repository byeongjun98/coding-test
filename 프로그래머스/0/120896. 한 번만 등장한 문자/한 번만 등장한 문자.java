import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                answer.append((char)('a' + i));
            }
        }

        return answer.toString();
    }
}