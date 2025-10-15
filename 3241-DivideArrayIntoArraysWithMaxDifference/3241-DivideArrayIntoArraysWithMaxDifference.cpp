// Last updated: 16/10/2025, 04:23:40
class Solution {
public:
    vector<vector<int>> divideArray(vector<int>& nums, int k) {
    sort(nums.begin(), nums.end());
    vector<vector<int>> result;
    vector<int> current_array;
    int casize = 0;


    for (int i = 0; i < nums.size(); ++i) {
        if(current_array.empty()){
            current_array.push_back(nums[i]);
            casize = 1;
            continue;
        }

        if(nums[i] - current_array[casize-1] <= k){
            current_array.push_back(nums[i]);
        }
        

        if (current_array.size() == 3 ) {
            result.push_back(current_array);
            current_array.clear();
        }
    }
     if(result.size() == nums.size()/3){
       return result;
     }else{
       return  {};
     }
        
   }
};