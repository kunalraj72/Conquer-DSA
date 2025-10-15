// Last updated: 16/10/2025, 04:30:35
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>>mergeIntervals;
        if(intervals.size() == 0){
            return mergeIntervals;
        }
        sort(intervals.begin(),intervals.end());
        vector<int>tempInterval = intervals[0];
        for(auto x : intervals){
            if(x[0] <= tempInterval[1]){
                tempInterval[1] = max(x[1],tempInterval[1]);
            }
            else{
                mergeIntervals.push_back(tempInterval);
                tempInterval=x;
            }
        }
        mergeIntervals.push_back(tempInterval);
        return mergeIntervals;
        
    }
};