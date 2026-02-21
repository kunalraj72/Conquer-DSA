// Last updated: 22/02/2026, 03:37:29
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int n = nums.length;
4        List<Integer> res = new ArrayList<>();
5        int elem1 = -1;
6        int elem2 = -1;
7        int count1 = 0;
8        int count2 = 0;
9// Why we r looking for only two element because there can be only 2 majority element(> n/3)
10// possible in an array at max
11        for(int i = 0; i < n; i++){
12            if(nums[i] == elem1){
13                count1++;
14            }else if(nums[i] == elem2){
15                count2++;
16            }else if(count1 == 0){
17                elem1 = nums[i];
18                count1++;
19            }else if(count2 == 0){
20                elem2 = nums[i];
21                count2++;
22            }
23            else{
24                count1--; //other than elem1 and elem2, remove cnt of both
25                count2--;
26            }
27        }
28
29        //elem1 and elem2 are possible candidates but not necessarily appears more than n/3 times
30        //so we will verify if both appears > n/3 times
31        count1 = 0;
32        count2 = 0;
33        for(int p : nums){
34            if(p == elem1){
35                count1++;
36            }else if(p == elem2){
37                count2++;
38            }
39        }
40
41        if(count1 > n/3){
42            res.add(elem1);
43        }
44        if(count2 > n/3){
45            res.add(elem2);
46        }
47
48        return res;
49    }
50}
51
52// [1,2,3,1,2]
53// elem1/cnt1 = 1(1) 1(0) 1(1) 
54// elem2/cnt2 = 2(1) 2(0) 2(1)
55// After Validation: Two majority element is present [1,2]
56
57// [1,2,3,1,4]
58// elem1/cnt1 = 1(1) 1(0) 1(1)
59// elem2/cnt2 = 2(1) 2(0) 4(1)
60// After Validation: Only one majority element is present [1]