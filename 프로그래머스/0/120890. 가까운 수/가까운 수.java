class Solution {
    public int solution(int[] array, int n) {

        int answer = array[0];

        for (int i = 1; i < array.length; i++) {

            int currentDiff = Math.abs(array[i] - n);
            System.out.println ("currentDiff = " + currentDiff);
            int answerDiff = Math.abs(answer - n);
            System.out.println("answerDiff = "+ answerDiff);

            if (currentDiff < answerDiff) {
                answer = array[i];
            }
            else if (currentDiff == answerDiff && array[i] < answer) {
                answer = array[i];
            }
        }

        return answer;
    }
}