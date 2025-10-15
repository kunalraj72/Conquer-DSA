// Last updated: 16/10/2025, 04:24:46
class Solution {
public:
    int beauty(vector<int>freq){
        int mini = INT_MAX;
        int maxi = INT_MIN;
        for(auto it : freq){
            if(it == 0) continue;
            mini = min(mini,it);
            maxi = max(maxi,it);
        }
        return maxi - mini;
    }
    
    int beautySum(string s) {
        //start your code Here
        int res = 0;
        for(int i=0;i<s.size();i++){
            vector<int> freq(26,0);
            for(int j=i;j<s.size();j++){
                freq[s[j] - 'a']++;
                res += beauty(freq);
            }
        }
        return res;
    }
};