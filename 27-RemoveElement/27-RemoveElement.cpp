// Last updated: 16/10/2025, 04:31:14
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
     int cnt = 0;
     int n = nums.size();
     for(auto it = nums.begin(); it != nums.end();){
         if(*it == val){
             nums.erase(it);
         }else{
             cnt++;
             it++;
         }
     }
        return cnt;
    }
};