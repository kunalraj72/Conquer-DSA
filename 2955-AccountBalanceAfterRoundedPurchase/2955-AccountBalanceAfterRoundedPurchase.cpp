// Last updated: 16/10/2025, 04:23:54
class Solution {
public:
    int accountBalanceAfterPurchase(int amt) {
        int num1 = amt%10;
        int ans = 0;
        
        if(num1 < 5){
            ans = amt - num1;
            ans = 100 - ans;
        }
        else if(num1 >= 5){
            ans = amt + (10 - num1);
            ans = 100 - ans;
        }
        return ans;
    }
};