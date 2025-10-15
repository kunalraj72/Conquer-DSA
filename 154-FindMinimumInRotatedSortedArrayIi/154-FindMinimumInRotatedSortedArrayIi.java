// Last updated: 16/10/2025, 04:28:41
class Solution {
    public int findMin(int[] nums) {
       
        int s = 0, e = nums.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;

            // Handle duplicates safely
            if (nums[mid] == nums[e]) {
                e--;
            } 
            // Right half is sorted OR pivot is in left half
            else if (nums[mid] < nums[e]) {
                e = mid;
            } 
            // Pivot must be in right half
            else {
                s = mid + 1;
            }
        }

        return nums[s];
    }
}