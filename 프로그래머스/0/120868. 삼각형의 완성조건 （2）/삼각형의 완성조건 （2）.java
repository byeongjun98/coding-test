import java.util.Arrays;

/*
(a + b - 1) - (b - a + 1) + 1 = 2a - 1
*/
class Solution {
    public int solution(int[] sides) {

        Arrays.sort(sides);

        int small = sides[0];

        return small * 2 - 1;
    }
}