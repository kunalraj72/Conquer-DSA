// Last updated: 04/02/2026, 04:29:45
1class Solution {
2
3    public static boolean isFeasible(int [] piles, int n, int k, int h){
4        int hours = 0;
5        for(int i = 0; i < n; i++){
6            // hours += piles[i]/k;
7            // if(piles[i]%k != 0){
8            //     hours++;
9            // }
10            
11    //above one also work but we can directily calculate the ceil of piles[i]/k
12
13            hours += Math.ceil((double) piles[i]/k);
14            
15            if(hours > h){
16                return false;
17            }
18        }
19        return true;
20    }
21
22    public int minEatingSpeed(int[] piles, int h) {
23        //Minimum speed : k=1: Koko can eat 1 banana per hour
24       //Maximum speed : 𝑘 = max(piles): Koko eats the largest pile in 1 hour
25       //we need to apply BS between these 2 streams
26
27       int n = piles.length;
28       int start = 1;
29       int end = Arrays.stream(piles).max().getAsInt();
30
31       while(start <= end){
32        int mid = start + (end - start)/2;
33        if(isFeasible(piles,n,mid,h)){
34            end = mid - 1;
35        }else{
36            start = mid + 1;
37        }
38       }
39       return start;
40    }
41}