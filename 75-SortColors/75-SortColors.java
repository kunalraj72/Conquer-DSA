// Last updated: 16/10/2025, 04:30:04
class Solution {

    public void swap(int [] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }

    public void sortColors(int[] nums) {
        //Similar as sort 0's, 1's and 2's problem
        //This is called Dutch National Flag Algorithm.
        int n = nums.length;
        int l=0,m=0;
        int h = n-1;
        while(m <= h){ // [2,0,1] : Try this test case u will understand why equality.
            if(nums[m] == 0){
                swap(nums, m, l);
                m++;
                l++;
            }
            else if(nums[m] == 1){
                m++;
            }
            else if(nums[m] == 2){
                swap(nums, m, h);
                h--;
            }
        }
    }
}