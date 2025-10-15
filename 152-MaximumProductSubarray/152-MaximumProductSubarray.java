// Last updated: 16/10/2025, 04:28:46
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;
        int prod = 1;

        for(int i = 0; i < n; i++){
            prod *= nums[i];
            maxProd = Math.max(prod, maxProd);
            if(prod == 0){
                prod = 1;
            }
        }

        prod = 1;
        for(int j = n - 1; j >= 0; j--){
            prod *= nums[j];
            maxProd = Math.max(prod, maxProd);
            if(prod == 0){
                prod = 1;
            }
        }

        return maxProd;
    }
}