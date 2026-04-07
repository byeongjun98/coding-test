import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        System.out.println("arr = " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("정렬한 arr = " + Arrays.toString(arr));

        StringBuilder sb = new StringBuilder(new String(arr));
        System.out.println("StringBuilder sb = " + sb);

        sb.reverse();
        System.out.println("reverse 한 sb = " + sb);

        return Long.parseLong(sb.toString());
    }
}