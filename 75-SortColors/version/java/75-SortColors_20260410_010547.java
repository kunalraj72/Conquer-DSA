// Last updated: 10/04/2026, 01:05:47
1class Solution {
2
3    public void swap(int [] nums, int idx1, int idx2){
4        int temp = nums[idx1];
5        nums[idx1] = nums[idx2];
6        nums[idx2] = temp;
7    }
8
9// We maintain 3 regions:
10// [0 ... l-1]      -> all 0s
11// [l ... m-1]      -> all 1s
12// [m ... h]        -> unknown
13// [h+1 ... n-1]    -> all 2s
14
15
16    public void sortColors(int[] nums) {
17        //Similar as sort 0's, 1's and 2's problem
18        //This is called Dutch National Flag Algorithm.
19        int n = nums.length;
20        int l=0,m=0;
21        int h = n-1;
22        while(m <= h){ // [2,0,1] : Try this test case u will understand why equality.
23            if(nums[m] == 0){
24                swap(nums, m, l);
25                m++; //we r doing m++ here because nums[l] might be 1 or already processed
26                l++;
27            }
28            else if(nums[m] == 1){
29                m++;   //nums[m] me hmko 1 hi chahiye islye just doing m++
30            }
31            else if(nums[m] == 2){
32                swap(nums, m, h);
33                h--;
34                // we r not doing m++ here becase Because the element that comes from h into m 
35                // is unknown. It could be: 0, 1 or 2. We have not processed it yet.
36            }
37        }
38    }
39}