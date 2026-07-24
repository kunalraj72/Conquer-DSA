// Last updated: 25/07/2026, 03:32:35
1class Solution { 
2
3    public void reverse(int [] nums, int left, int right){
4        while(left < right){
5            int temp = nums[left];
6            nums[left++] = nums[right];
7            nums[right--] = temp;
8        }
9    }
10
11    public void rotate(int[] nums, int k) {
12        int n = nums.length;
13        if(n == 0 || k % n == 0) return;
14        k = k%n;
15
16        reverse(nums, 0, n - k - 1);
17        reverse(nums, n - k, n - 1);
18        reverse(nums, 0, n - 1);
19        
20    }
21}
22
23//Note: The subList method in Java returns a view of the original list, and changes made to the view are reflected in the original list.
24
25      