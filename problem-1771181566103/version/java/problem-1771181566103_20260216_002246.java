// Last updated: 16/02/2026, 00:22:46
1class Solution {
2    public int maxChunksToSorted(int[] arr) {
3        int n = arr.length;
4        int maxSoFar = Integer.MIN_VALUE;
5        int cnt = 0;
6
7        for(int i = 0; i < n; i++){
8            maxSoFar = Math.max(maxSoFar, arr[i]);
9            if(maxSoFar == i){
10                cnt++;
11            }
12        }
13        return cnt;
14    }
15}