// Last updated: 16/10/2025, 04:30:44
class Solution {
    public int trap(int[] height) {
       int n = height.length;
       int l = 0;
       int r = n - 1;
       int left_max = 0;
       int right_max = 0;
       int contains_water = 0;

       while(l < r){

        left_max = Math.max(left_max, height[l]);
        right_max = Math.max(right_max, height[r]);

        if(left_max <= right_max){
            contains_water += left_max - height[l++];
        }else{
            contains_water += right_max - height[r--];
        }

       }
       return contains_water;
    }
}