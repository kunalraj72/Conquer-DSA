// Last updated: 16/10/2025, 04:30:58
class Solution {
    
    public void swap(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    
    public void reverse(int[] a,int i,int j){
        while( i < j ) swap(a,i++,j--);   
    }
    
    public void nextPermutation(int[] nums) {
        //See Tech Dose Video for intuition
        int n = nums.length;
        int idx1 = -1;

        for(int i = n - 1; i >= 1; i--){
            if(nums[i] > nums[i - 1]){
                idx1 = i;
                break;
            }
        }

        if(idx1 == -1){
            reverse(nums, 0, n - 1);
        }else{
            int idx2 = idx1;
            for(int i = idx1 + 1; i < n; i++){
                if(nums[i] > nums[idx1 - 1]){
                    idx2 = i;
                }
            }
            swap(nums, idx1 - 1, idx2);
            reverse(nums, idx1, n-1);
        }
    }
}