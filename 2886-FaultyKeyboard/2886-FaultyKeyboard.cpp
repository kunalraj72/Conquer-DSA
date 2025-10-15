// Last updated: 16/10/2025, 04:24:04
#include<bits/stdc++.h>
class Solution {
public:
    
    string finalString(string s) {
        int st = 0;
        string ans = "";
        for(int i=0;i<s.length();i++){
            if(s[i] != 'i'){
                ans += s[i];
            }
            else if(s[i] == 'i'){
                int j = i-1;
                reverse(ans.begin(),ans.end());
            }
        }
        
        return ans;
    }
};