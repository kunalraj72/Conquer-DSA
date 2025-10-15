// Last updated: 16/10/2025, 04:27:52
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int elem1 = -1;
        int elem2 = -1;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == elem1){
                count1++;
            }else if(nums[i] == elem2){
                count2++;
            }else if(count1 == 0){
                elem1 = nums[i];
                count1++;
            }else if(count2 == 0){
                elem2 = nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int p : nums){
            if(p == elem1){
                count1++;
            }else if(p == elem2){
                count2++;
            }
        }

        if(count1 > n/3){
            res.add(elem1);
        }
        if(count2 > n/3){
            res.add(elem2);
        }

        return res;
    }
}