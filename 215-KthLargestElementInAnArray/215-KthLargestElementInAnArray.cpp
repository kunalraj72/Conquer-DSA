// Last updated: 16/10/2025, 04:28:02
#include<bits/stdc++.h>
class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
         priority_queue< int, vector<int>, greater<int> > minHeap;
        for(int i=0;i<nums.size();i++){
          if(i<k)  {minHeap.push(nums[i]);}
            if(i>=k){
            if(nums[i]>minHeap.top()){
                minHeap.pop();
                minHeap.push(nums[i]);
            }
        }
    }     
        return minHeap.top();
    }
};