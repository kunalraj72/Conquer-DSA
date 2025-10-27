// Last updated: 28/10/2025, 01:45:36
class Solution {
    public long removeZeros(long n) {
        String s = Long.toString(n);
         s = s.replace("0", "");
         return Long.parseLong(s);
    }
}