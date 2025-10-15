// Last updated: 16/10/2025, 04:31:36
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max_area = Integer.MIN_VALUE;
        while(l < r){
            int area = (Math.min(height[l],height[r]))*(r - l);
            max_area = Math.max(area,max_area);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max_area;
    }
}