// Last updated: 16/10/2025, 04:29:56
class Solution {

    int getPivot(int[] nums, int n){
    int s = 0;
    int e = n - 1;
    while(s < e){
        while(s < e && nums[s] == nums[s+1]){
            s++;
        }
        while(s < e && nums[e] == nums[e-1]){
            e--;
        }
        int mid = s + (e - s) / 2;
        if(nums[mid] > nums[e]){
            s = mid + 1;
        } else {
            e = mid;
        }
    }
    return s;
}
    
    boolean binarySearch(int[] nums, int s, int e, int key){
        int start=s;
        int end=e;
        int mid=start+(end-start)/2;
        while(start<=end){
           if(nums[mid]==key){
               return true;
           }
           else if(key>nums[mid] ){
               start=mid+1;
           }
           else{
               end=mid-1;
           }
           mid=start+(end-start)/2;
        }
        return false;
 }

    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if(n == 1) return nums[0] == target ? true : false;
        int pivot = getPivot(nums,n);

        if(n - 1 >= 0 && target >= nums[pivot] && target <= nums[n-1]){
            return binarySearch(nums,pivot,n-1,target);
        }else{
            return binarySearch(nums,0,pivot-1,target);
        }
    }
}