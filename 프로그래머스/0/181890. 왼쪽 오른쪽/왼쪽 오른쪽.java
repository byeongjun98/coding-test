import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int lIndex = Arrays.asList(str_list).indexOf("l");
        int rIndex = Arrays.asList(str_list).indexOf("r");

        if (lIndex == -1 && rIndex == -1) {
            return new String[0];
        }

        // l이 먼저인 경우: r이 없거나(rIndex == -1), l이 r보다 앞
        if (rIndex == -1 || (lIndex != -1 && lIndex < rIndex)) {
            return Arrays.copyOfRange(str_list, 0, lIndex);
        }

        // 그 외 = r이 먼저인 경우
        return Arrays.copyOfRange(str_list, rIndex + 1, str_list.length) ;
    }
}