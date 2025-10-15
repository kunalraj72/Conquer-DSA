// Last updated: 16/10/2025, 04:25:43
class Solution {

    public static boolean isFeasible(int [] piles, int n, int k, int h){
        int hours = 0;
        for(int i = 0; i < n; i++){
            // hours += piles[i]/k;
            // if(piles[i]%k != 0){
            //     hours++;
            // }
            
    //above one also work but we can directily calculate the ceil of piles[i]/k

            hours += Math.ceil((double) piles[i]/k);
            
            if(hours > h){
                return false;
            }
        }
        return true;
    }

    public int minEatingSpeed(int[] piles, int h) {
        //Minimum speed : k=1: Koko can eat 1 banana per hour
       //Maximum speed : \U0001d458 = max(piles): Koko eats the largest pile in 1 hour
       //we need to apply BS between these 2 streams

       int n = piles.length;
       int start = 1;
       int end = Arrays.stream(piles).max().getAsInt();

       while(start <= end){
        int mid = start + (end - start)/2;
        if(isFeasible(piles,n,mid,h)){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
       }
       return start;
    }
}