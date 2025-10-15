// Last updated: 16/10/2025, 04:27:12
class Solution {
public:
    //Video: https://www.youtube.com/watch?v=JQqWiq4zDHk&list=RDMM&index=11
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> pq;
        vector<int> ans;
        for(auto it : nums){
            mp[it]++;
        }
        for(auto it : mp){
            int key = it.first;
            int value = it.second;
            pq.push({value,key});
            if(pq.size() > k){
                pq.pop();
            }
        }
        
        
        while(!pq.empty()){
            ans.push_back(pq.top().second);
            pq.pop();
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};