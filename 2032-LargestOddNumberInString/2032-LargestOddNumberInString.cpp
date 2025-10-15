// Last updated: 16/10/2025, 04:24:53
#include<string>
class Solution {
public:
    string largestOddNumber(string num) {
        int n = num.length();
        string max_odd = "";
        for(int i=n-1;i>=0;i--){
            if((num[i] - '0')%2 == 1){
                max_odd = num.substr(0,i+1);
                if(max_odd != "") return max_odd;
            }
        }
        
        return "";
    }
};