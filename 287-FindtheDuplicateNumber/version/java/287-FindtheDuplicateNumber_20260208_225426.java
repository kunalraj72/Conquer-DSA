// Last updated: 08/02/2026, 22:54:26
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = nums[0];
4        int fast = nums[0];
5
6        //first loop will confirm the existence of loop
7        do{
8            slow = nums[slow];
9            fast = nums[nums[fast]];
10        }while(slow != fast);
11
12        //second loop will find the entry point of the loop, i.e, the duplicate element.
13        fast = nums[0];
14        while(slow != fast){
15            slow = nums[slow];
16            fast = nums[fast];
17        }
18
19        return slow | fast;
20    }
21}