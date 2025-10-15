// Last updated: 16/10/2025, 04:23:50
class Solution {
public:
    int numberOfPoints(vector<vector<int>>& nums) {
        int n = nums.size();
        unordered_map<int,int> mp;
        for(int i=0;i<n;i++){
           int minx = nums[i][0];
           int maxy = nums[i][1];
           for(int j=minx; j<=maxy;j++){
               if(mp.find(j) == mp.end()){
                   mp[j]++;
               }
           }
        }
        return mp.size();
    }
};