// Last updated: 16/10/2025, 04:30:55
class Solution {
    
    int getPivot(int[] nums, int n){

        int s = 0;
        int e = n-1;

        //Edge cases
        if(n == 1){   //size = 1
            return 0;
        }
        if(nums[0] < nums[n-1]){  //12345  not rotated
            return 0; 
        }

        while(s <= e){
            int mid = s + (e - s)/2;
            // Check if mid is the pivot
            if(mid - 1 >= 0 && nums[mid] < nums[mid - 1]){
             return mid;
           }
           // Check if mid+1 is the pivot
           else if(mid + 1 <= n - 1 && nums[mid] > nums[mid + 1]){
            return mid + 1;
           }
           //If nums[mid] >= nums[s], mid is on line s1 (4,5,...7)
           else if(nums[mid] >= nums[s]){
             s = mid + 1;
            //mid is on line s2 (0,1,2)
           }else{
             e = mid - 1;
          }
        }
        return -1; // Default return (shouldn't be reached in valid input)
    }
    
    int binarySearch(int[] nums, int s, int e, int key){
        int start=s;
        int end=e;
        int mid=start+(end-start)/2;
        while(start<=end){
           if(nums[mid]==key){
               return mid;
           }
           else if(key>nums[mid] ){
               start=mid+1;
           }
           else{
               end=mid-1;
           }
           mid=start+(end-start)/2;
        }
        return -1;
 }
    
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n == 1) return nums[0] == target ? 0 : -1;
        int pivot = getPivot(nums,n);

        if(n - 1 >= 0 && target >= nums[pivot] && target <= nums[n-1]){
            return binarySearch(nums,pivot,n-1,target);
        }else{
            return binarySearch(nums,0,pivot-1,target);
        }
   }
}