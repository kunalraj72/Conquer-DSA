// Last updated: 08/02/2026, 20:23:40
1class Solution {
2    public int maxArea(int[] height) {
3        int l = 0;
4        int r = height.length - 1;
5        int max_area = Integer.MIN_VALUE;
6        
7        while(l < r){
8            int area = Math.min(height[l], height[r]) * (r - l);
9            max_area = Math.max(area, max_area);
10            //we r moving smaller pointer because if we move bigger pointer
11           //then area will be same or smaller but we want to maximize it.
12            if(height[l] < height[r]){ 
13                l++;
14            }else{
15                r--;
16            }
17        }
18        return max_area;
19    }
20}