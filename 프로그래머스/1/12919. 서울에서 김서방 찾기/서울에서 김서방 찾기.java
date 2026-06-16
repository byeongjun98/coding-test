import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        int where = Arrays.asList(seoul).indexOf("Kim");
        answer += "김서방은 ";
        answer += where;
        answer += "에 있다";
        
        return answer;
    }
}