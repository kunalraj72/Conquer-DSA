// Last updated: 16/10/2025, 04:28:19
class Solution { 

    public void reverse(int [] nums, int left, int right, int n){
        while(left < right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 0 || k % n == 0) return;
        k = k%n;

        reverse(nums, 0, n - k - 1, n);
        reverse(nums, n - k, n - 1, n);
        reverse(nums,0, n - 1, n);  
        
    }
}

//Note: The subList method in Java returns a view of the original list, and changes made to the view are reflected in the original list.

      