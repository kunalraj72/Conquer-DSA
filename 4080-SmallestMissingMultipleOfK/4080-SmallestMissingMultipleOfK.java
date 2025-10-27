// Last updated: 28/10/2025, 01:45:35
class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) set.add(num);
        int temp = k;
        while(true){
            if(!set.contains(temp)){
                return temp;
            }
            temp += k;
        }
    }
}