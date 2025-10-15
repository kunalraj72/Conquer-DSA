// Last updated: 16/10/2025, 04:24:47
class Solution {
    public String largestOddNumber(String num) {
        
        int n = num.length();
        String max_odd = "";
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i) - '0')%2 == 1){
                max_odd = num.substring(0,i+1);
                if(max_odd != "") return max_odd;
            }
        }
        return "";
    }
}