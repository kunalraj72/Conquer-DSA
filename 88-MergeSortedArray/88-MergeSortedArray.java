// Last updated: 16/10/2025, 04:29:45
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int ans[] = new int[m+n];
        
        
        if(n != 0){ //if n == 0 then no need to change anything
          int i = 0;
          int j = 0;
          int k = 0;
          while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                ans[k++] = nums1[i++];
            }else{
                ans[k++] = nums2[j++];
            }
          }
            
          if(i == m){
                while(k<m+n){
                    ans[k++] = nums2[j++];
                }
            }
            else if(j == n){
                while(k<m+n){
                    ans[k++] = nums1[i++];
                }
            }
            for(i=0;i<ans.length;i++){
              nums1[i] = ans[i];
            }
        }
    }
}
