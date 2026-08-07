// Last updated: 08/08/2026, 04:09:09
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length;
4        int maxProd = Integer.MIN_VALUE;
5        int prod = 1;
6
7        for(int i = 0; i < n; i++){
8            prod *= nums[i];
9            maxProd = Math.max(prod, maxProd);
10            if(prod == 0){
11                prod = 1;
12            }
13        }
14
15        prod = 1;
16        for(int j = n - 1; j >= 0; j--){
17            prod *= nums[j];
18            maxProd = Math.max(prod, maxProd);
19            if(prod == 0){
20                prod = 1;
21            }
22        }
23
24        return maxProd;
25    }
26}