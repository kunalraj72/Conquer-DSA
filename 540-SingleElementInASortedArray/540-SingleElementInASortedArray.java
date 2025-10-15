// Last updated: 16/10/2025, 04:26:29
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s=0,e=n-1;
        int mid = 0;
        
        while(s < e){
            mid = (s + e)/2; 
            if(mid % 2 == 1){
                mid--;         //shifting mid to first occurrence of an element
            }
            if(nums[mid] != nums[mid+1]){ //if both r not matching it means unique/single element is present towards left side
                e = mid;
            }else{
                s = mid +2;   //else unique/single element is present towards right side
            }
        }
        return nums[s] | nums[e];
    }
}

// https://leetcode.com/problems/single-element-in-a-sorted-array/discuss/3212178/Day-52-oror-Binary-Search-oror-Easiest-Beginner-Friendly-Sol