// Last updated: 16/10/2025, 04:31:04
class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0, n = haystack.length();
        int m = needle.length();
        while(i < n ){ 
            if(haystack.charAt(i) == (needle.charAt(0))){
            String str = "";
            if(i + m - 1 < n) {
                str = haystack.substring(i,i+m);
            } 
            if(str.equals(needle)){
                return i;
            }
          }
            i++;
        }
        return -1;
    }
}