// Last updated: 16/10/2025, 04:31:49
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1) return s;
        String LPS = "";

        for(int i = 0; i < n; i++){
            //consider odd length palindrome
            int low = i;
            int high = i;

            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == n){
                    break;
                }
            }
            String palindrome = s.substring(low + 1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }

            //consider even length palindrome
            low = i - 1;
            high = i;
             while(low >= 0 && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                if(low == -1 || high == n){
                    break;
                }
            }
            palindrome = s.substring(low + 1, high);
            if(palindrome.length() > LPS.length()){
                LPS = palindrome;
            }
        }
        return LPS;
    }
}