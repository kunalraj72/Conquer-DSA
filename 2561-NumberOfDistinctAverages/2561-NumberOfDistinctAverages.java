// Last updated: 16/10/2025, 04:24:26
class Solution {
    public int distinctAverages(int[] nums) {
     int n = nums.length;
     Arrays.sort(nums);
     HashSet<Float> avgSet = new HashSet<>();
     int s = 0;
     int e = n - 1;

     while(s < e){
        float avg = (nums[s] + nums[e])/2f;
        avgSet.add(avg);
        s++;
        e--;
     }
     return avgSet.size();
    }
}