// Last updated: 16/10/2025, 04:30:51
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        //just calculate floor of target and the index next the the floor element will be the answer
        while(s <= e){
            int mid = (s + e)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                e = mid - 1;
            }
            else if(target > nums[mid]){
                s = mid + 1;
            }
        }
        return s; 
    }
}