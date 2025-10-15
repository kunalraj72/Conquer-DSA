// Last updated: 16/10/2025, 04:24:10
class Solution {
public:
    int minimumSum(int n, int k) {
        int ans = 0;
        int i = 1;
        int j = 1;
        unordered_map<int,int> mp;
        while(j <= n){
            int b = k - i;
            if(mp.find(b) == mp.end()){
                ans += i;
                j++;
            }
            mp[i]++;
            i++;
        }
        return ans;
    }
};