// Last updated: 16/10/2025, 04:28:28
class Solution {
    //Boyer–Moore majority vote algorithm
    public int majorityElement(int[] nums) {
      int n = nums.length;
      int count = 0;
      int majorityElem = 0;

      for(int i = 0; i < n; i++){
        if(count == 0){
            majorityElem = nums[i];
            count++;
        }
        else if(nums[i] != majorityElem){
            count--;
        }else{
            count++;
        }
      }
      return majorityElem;
    }
}

