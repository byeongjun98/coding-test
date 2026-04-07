class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;

        System.out.println("초기값 -> x: " + x + ", temp: " + temp + ", sum: " + sum);

        while(temp > 0){
            int digit = temp % 10;

            System.out.println("현재 자리수: " + digit);

            sum += digit;
            System.out.println("sum 누적: " + sum);

            temp /= 10;
            System.out.println("temp 감소: " + temp);

            System.out.println("------");
        }

        System.out.println("최종 sum: " + sum);
        System.out.println("x % sum = " + (x % sum));

        return x % sum == 0;
    }
}