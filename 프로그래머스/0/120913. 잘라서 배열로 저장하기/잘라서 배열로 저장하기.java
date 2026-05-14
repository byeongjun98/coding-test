class Solution {
    public String[] solution(String my_str, int n) {

        int size = (my_str.length() + n - 1) / n;
        System.out.println("사이즈: " + size);

        String[] answer = new String[size];

        int index = 0;

        for(int i = 0; i < my_str.length(); i += n) {

            int end = Math.min(i + n, my_str.length());
            System.out.println("end: " + end);
            
            answer[index] = my_str.substring(i, end);

            index++;
        }

        return answer;
    }
}