// Last updated: 16/10/2025, 04:24:43
#include<string>
class Solution {
public:
    string kthLargestNumber(vector<string>& nums, int k) {
         priority_queue<pair<int,string>,vector<pair<int,string>>,greater<pair<int,string>>> pq;
        int n=nums.size();
        for(auto it:nums){
            int len=it.length();
            pq.push({len,it});
            if(pq.size()>k){
                pq.pop();
            }
        }
        return pq.top().second;
    }
};