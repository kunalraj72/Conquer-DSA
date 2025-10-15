// Last updated: 16/10/2025, 04:24:59
class Solution {

    public static boolean isFeasible(int [] bloomDay, int n, int maxBloomCap, int m, int k){
        int bloomedFlower = 0;
        int adjCnt = 0;
        for(int i = 0; i< n; i++){

            if(bloomDay[i] <= maxBloomCap){
                adjCnt++;
                if(adjCnt == k){
                    bloomedFlower++;
                    adjCnt = 0;
                }
                if(bloomedFlower == m){
                    return true;
                }
            }
            else{
                adjCnt = 0;
            }
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int start = Arrays.stream(bloomDay).min().getAsInt();
        int end = Arrays.stream(bloomDay).max().getAsInt();
        int res = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isFeasible(bloomDay,n,mid,m,k)){
                res = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;
    }
}