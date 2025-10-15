// Last updated: 16/10/2025, 04:27:24
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                continue;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for(int k=j;k<n;k++){
            nums[k] = 0;
        }
    }
}

//Hint: Skips pointer i whenever 0 or else swap with pointer j