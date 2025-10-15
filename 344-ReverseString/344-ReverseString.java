// Last updated: 16/10/2025, 04:27:15
class Solution {

    public void recReverse(char[] str, int s, int e){

        if(s >= e){
            return;
        }

        char temp = str[s];
        str[s] = str[e];
        str[e] = temp;

        recReverse(str, s+1, e-1);

    }

    public void reverseString(char[] s) {
        int n = s.length;
        recReverse(s, 0, n - 1);
    }
}