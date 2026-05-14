class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "";

        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            // 숫자면 이어붙이기
            if(Character.isDigit(ch)) {
                num += ch;
                System.out.println("숫자면 이어붙이기(ch) : " + ch);
                System.out.println("숫자면 이어붙이기(num) : " + num);
            } 
            // 문자를 만났고 num에 숫자가 쌓여있다면 더하기
            else {
                if(!num.equals("")) {
                    answer += Integer.parseInt(num);
                    System.out.println("문자를 만났고 num에 숫자가 쌓여있다면 더하기(answer) : " + answer);
                    num = "";
                }
            }
        }

        // 마지막 숫자 처리
        if(!num.equals("")) {
            answer += Integer.parseInt(num);
            System.out.println("마지막 숫자 처리(answer) : " + answer);
        }

        return answer;
    }
}