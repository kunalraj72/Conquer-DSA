// Last updated: 16/10/2025, 04:28:35
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        //  Boyer-Moore Voting Algorithm
        int res = 0;
        int count = 0;
        for(auto it : nums){
            if(count == 0){
                res = it;
                count++;
            }
            else if(it == res){
                count++;
            }
            else{
                count--;
            }
        }
        int cnt = 0;
        for(auto it : nums){
            if(it == res){
                cnt++;
            }
        }
        if(cnt > nums.size()/2){
            return res;
        }
        return -1;
    }
};