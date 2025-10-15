// Last updated: 16/10/2025, 04:23:42
class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        unordered_map<int,int> mp(0);
        int n=grid[0].size();
        vector<int> ans(2);
        for(int i=1;i<=(n*n);i++){
        mp[i] = 0; 
    }
        //int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    mp[grid[i][j]]++;
                }
        }
         for(int i=1;i<=(n*n);i++){
        if(mp[i] == 0){
            ans[1] = i;
        }
        if(mp[i] == 2){
            ans[0] = i;
        }
    }
        return ans;
        
    }
};