class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] moeum = {"a", "e", "i", "o", "u"};
        for(int i = 0; i<moeum.length; i++) {
			if( my_string.contains(moeum[i])) {
				answer = my_string.replaceAll(moeum[i], "");
				my_string = answer;
			} else {
                answer =my_string;
            }
		}
        return answer;
    }
}