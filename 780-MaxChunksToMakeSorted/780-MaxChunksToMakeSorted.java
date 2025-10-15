// Last updated: 16/10/2025, 04:26:01
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int maxSoFar = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i = 0; i < n; i++){
            maxSoFar = Math.max(maxSoFar, arr[i]);
            if(maxSoFar == i){
                cnt++;
            }
        }
        return cnt;
    }
}