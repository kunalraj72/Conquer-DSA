// Last updated: 16/10/2025, 04:29:11
class Solution {
    
    public String getActualString(String s, int n){

        String str = "";
        for(int i = 0; i< n; i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                continue;
            }
            str += s.charAt(i);
        }
        return str.toLowerCase();
    }

    public boolean recCheckForPal(String str, int s, int e){

        if(s > e) return true;

        if(str.charAt(s) != str.charAt(e)){
            return false;
        }

        return recCheckForPal(str, s + 1, e - 1);
    }
    
    public boolean isPalindrome(String s) {
        
        int n = s.length();
        if(s.isEmpty()) return true;
        if(s.length() == 1 && s.charAt(0) == ' ') return true;
        
        String str = getActualString(s,n);
        if(str.length() == 1 && !Character.isLetterOrDigit(str.charAt(0))) return false;
        
        return recCheckForPal(str, 0, str.length() - 1);
    }
}