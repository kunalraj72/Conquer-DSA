// Last updated: 08/02/2026, 03:11:37
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int n = nums.length;
4        int i = 0;
5        int j = 0;
6        int cnt = 0;
7        int flip = 0;
8        
9        while(j < n){
10            if(nums[j] == 0){
11                flip++;
12            }
13            if(flip > k){
14                while(flip > k){
15                    if(nums[i] == 0){
16                        flip--;
17                    }
18                    i++;
19                }
20            }
21            if(flip <= k){
22                cnt = Math.max(cnt, j - i + 1);
23            }
24            
25            j++;
26        }
27        return cnt;
28    }
29}