// Last updated: 16/10/2025, 04:25:48
class Solution {
public:
     bool Time(vector<int>piles, int eatSpeed, int H){
        long long int sum = 0;
        for(int i=0;i<piles.size();i++){
            sum += piles[i]/eatSpeed + (piles[i]%eatSpeed != 0);
        }
        return sum<=H;
    }
    
    int minEatingSpeed(vector<int>& piles, int H) {
        int s = 1;
        int e = *max_element(piles.begin(),piles.end());
        int ans = 0;
        while(s <= e){
            int mid = (s+e)/2;
            if(Time(piles,mid,H)){
                ans = mid;
                e = mid - 1;
            }
            
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
};