// Last updated: 16/10/2025, 04:28:25
class Solution {
public:
    void reverse(vector<int> &nums, int s, int e){
        int i = s;
        int j = e;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        if(n == 0 || n == 1){
            return;
        }
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
};