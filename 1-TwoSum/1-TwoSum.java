// Last updated: 16/10/2025, 04:32:00
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap();
        int n = nums.length;
        int ans[] = new int[2];
        for(int i=0;i<n;i++){
            int b = target - nums[i];
            if(mp.containsKey(b)){
                ans[0] = i;
                ans[1] = mp.get(b);
                break;
            }else{
                mp.put(nums[i],i);
            }
        }
        return ans;
    }
}