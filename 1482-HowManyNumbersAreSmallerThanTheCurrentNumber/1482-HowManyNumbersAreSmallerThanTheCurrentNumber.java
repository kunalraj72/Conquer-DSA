// Last updated: 16/10/2025, 04:25:03
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sortedArray = Arrays.copyOf(nums, n);
        Arrays.sort(sortedArray);
        HashMap<Integer,Integer> CntMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            CntMap.putIfAbsent(sortedArray[i], i);
        }
        for(int i = 0; i < n; i++){
            nums[i] = CntMap.get(nums[i]);
        }
        return nums;
    }
}