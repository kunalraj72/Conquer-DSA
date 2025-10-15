// Last updated: 16/10/2025, 04:28:45
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;

        //Edge cases
        if(n == 1){   //size = 1
            return nums[0];
        }
        if(nums[0] < nums[n-1]){  //12345  not rotated
            return nums[0]; 
        }

        while(s < e){
            int mid = s + (e - s)/2;
            // Check if mid is the pivot
            if(mid - 1 >= 0 && nums[mid] < nums[mid - 1]){
             return nums[mid];
           }
           // Check if mid+1 is the pivot
           else if(mid + 1 <= n - 1 && nums[mid] > nums[mid + 1]){
            return nums[mid + 1];
           }
           //If nums[mid] >= nums[s], mid is on line s1 (4,5,...7)
           else if(nums[mid] >= nums[s]){
             s = mid + 1;
            //mid is on line s2 (0,1,2)
           }else{
             e = mid - 1;
          }
        }
        return -1; // Default return (shouldn't be reached in valid input)
    }
}