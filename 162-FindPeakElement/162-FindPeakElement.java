// Last updated: 16/10/2025, 04:28:37
class Solution {
    public int findPeakElement(int[] nums) {
      int n = nums.length;
      int s = 0;
      int e = n - 1;
      
      //edge case
      if(n == 1) return 0;
      if(n == 2 && nums[0] > nums[1]) return 0;
      if(n == 2 && nums[0] < nums[1]) return 1;
      
       while(s < e){
           int mid = s + (e - s)/2;
           
           if(nums[mid] < nums[mid + 1]){
            s = mid + 1;
           }else{
            e = mid;
           }
       }
       return s | e;
    }
}