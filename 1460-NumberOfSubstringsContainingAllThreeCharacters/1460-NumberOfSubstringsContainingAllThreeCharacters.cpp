// Last updated: 16/10/2025, 04:25:05

//Video: https://www.youtube.com/watch?v=VNL2VhDxj7U
#include<bits/stdc++.h>
class Solution {
public:
    int numberOfSubstrings(string s) {
        int recent__a = -1;
        int recent__b = -1;
        int recent__c = -1;
        int count = 0;
        for(int i=0;i<s.size();i++){
            if(s[i] == 'a'){
                recent__a = i;
            }
            else if(s[i] == 'b'){
                recent__b = i;
            }
            else{
                recent__c = i;
            }
            if(i>1){
             count +=  min(recent__a,min(recent__b,recent__c))+1;      
            }
    
        }
        return count;
    }
};