// Last updated: 03/08/2026, 15:09:13
1class Solution {
2    //Boyer–Moore majority vote algorithm
3    public int majorityElement(int[] nums) {
4      int n = nums.length;
5      int count = 0;
6      int majorityElem = 0;
7
8      for(int i = 0; i < n; i++){
9        if(count == 0){
10            majorityElem = nums[i];
11            count++;
12        }else if(nums[i] == majorityElem){
13            count++;
14        }else{
15            count--;
16        }
17      }
18      return majorityElem;
19    }
20}
21
22