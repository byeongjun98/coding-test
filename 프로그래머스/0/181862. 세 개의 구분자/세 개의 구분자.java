import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < myStr.length(); i++){
            if(myStr.charAt(i) != 'a' && myStr.charAt(i) != 'b'&& myStr.charAt(i) != 'c'){
                sb.append(myStr.charAt(i));
                // System.out.println(sb);
            }else{
                if(sb.length() > 0){
                    result.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            result.add(sb.toString());
        }
        
        if (result.isEmpty()){
            return new String[]{"EMPTY"};
        }
        
        return result.toArray(new String[0]);
    }
}