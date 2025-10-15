// Last updated: 16/10/2025, 04:30:52
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int first = -1;
        int last = -1;
        int [] ans = new int[2];
        
        while(s <= e){
            int mid = s + (e - s)/2;
            if(nums[mid] == target){
                first = mid;
                if(mid - 1 >= 0){
                    e = mid - 1;
                }else{
                    break;
                }
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        s = 0;
        e = n -1;

        while(s <= e){
            int mid = s + (e - s)/2;
            if(nums[mid] == target){
                last = mid;
                if(mid + 1 <= n - 1){
                    s = mid + 1;
                }else{
                    break;
                }
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }

        ans[0] = first;
        ans[1] = last;

        return ans;
    }
}