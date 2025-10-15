// Last updated: 16/10/2025, 04:30:25
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int ans[] = new int[n];
        int carry = 1;
        for(int i = n - 1; i >= 0; --i){
            ans[i] = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
        }
        if(carry != 0){
            ans = Arrays.copyOf(ans, ans.length + 1);
            ans[ans.length - 1] = 0;
            ans[0] = 1;
        }
        return ans;
    }
}