// Last updated: 16/10/2025, 04:23:51
class Solution {
public:
    bool canMakeSubsequence(string str1, string str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if(n2 > n1) return false;
        
        int c = 0;
        for(int i=0;i<n1 && c<n2; i++){
            if(str1[i] == str2[c]){
                c++;
            }
            else if(((str1[i] - 'a')+1)%26 + 'a' == str2[c]){
                c++;
            }
        }
        return c == n2;
    }
};