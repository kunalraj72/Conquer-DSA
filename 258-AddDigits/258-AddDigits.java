// Last updated: 16/10/2025, 04:27:27
class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
            if(num == 0 && sum >= 10){
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}