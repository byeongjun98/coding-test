class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder result = new StringBuilder();
        result.append(my_string.substring(0, s));
        for (int i = e; i >= s; i--) {
            result.append(my_string.charAt(i));
        }
        result.append(my_string.substring(e + 1));
        return result.toString();
    }
}