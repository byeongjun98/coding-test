class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int len = 0;
        
        if(s.length() % 2 == 1){
            len = s.length() / 2 ;
            sb.append(s.charAt(len));
        } else {
            len = s.length() / 2 - 1;
            sb.append(s.charAt(len));
            sb.append(s.charAt(len + 1));
        }
        
        return sb.toString();
    }
}