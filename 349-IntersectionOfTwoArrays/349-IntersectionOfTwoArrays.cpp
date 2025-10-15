// Last updated: 16/10/2025, 04:27:10
#include<unordered_set>
class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
       unordered_set<int> set;
        vector<int> result;
        int m=nums1.size();
        int n=nums2.size();
        for(int i=0;i<m;i++){
            set.insert(nums1[i]);
        }
        for(int j=0;j<n;j++){
            if(set.find(nums2[j]) !=set.end()){
                result.push_back(nums2[j]);
                set.erase(nums2[j]);
            }
        }
        return result;
    }
};