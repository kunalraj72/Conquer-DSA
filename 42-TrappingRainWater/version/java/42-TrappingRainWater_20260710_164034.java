// Last updated: 10/07/2026, 16:40:34
1class Solution {
2    
3    public int trap(int[] height) {
4       int n = height.length;
5       int [] leftMax = new int[n];
6       int [] rightMax = new int[n];
7       leftMax[0] = height[0];
8       rightMax[n - 1] = height[n - 1];
9
10       for(int i = 1; i < n; i++){
11           leftMax[i] = Math.max(height[i], leftMax[i - 1]);
12           rightMax[n - i - 1] = Math.max(height[n - i - 1], rightMax[n - i]);
13       }
14       int water = 0;
15       for (int i = 0; i < n; i++) {
16            water += Math.min(leftMax[i], rightMax[i]) - height[i];
17        }
18        return water;
19    }
20}