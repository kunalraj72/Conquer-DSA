// Last updated: 16/10/2025, 04:31:44
class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        double num = 0;
        int i=0;
        if(len == 0){
            return 0;
        }
        
        while(i < len && s.charAt(i) == ' '){
            i++;
        }

        if(i == len){
            return 0;
        }
        
        boolean positive = s.charAt(i) == '+';
        boolean negative = s.charAt(i) == '-';
        
        if(positive == true || negative == true){
            i++;
        }

        while(i < len && s.charAt(i) == '0'){
            i++;
        }

        while(i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }

        num = negative == true ? -num : num;
        num = (num > Integer.MAX_VALUE) ? Integer.MAX_VALUE: num;
        num = (num < Integer.MIN_VALUE) ? Integer.MIN_VALUE : num;

        return (int) num;
    }
}