// Last updated: 12/02/2026, 04:19:01
1class Solution {
2    public int[] frequencySort(int[] nums) {
3        Map<Integer, Integer> freq = new HashMap<>();
4        for(int it : nums){
5             freq.put(it, freq.getOrDefault(it, 0) + 1);
6        }
7
8        //Note: We cannot use comparator with primitive type
9        Integer arr[] = new Integer[nums.length];
10        int i = 0;
11        for(int it : nums){
12            arr[i++] = it;
13        }
14
15        //Main concept in comparator
16        //negative → a first
17        //positive → b first
18
19        Arrays.sort(arr, (a, b) -> {
20            int fa = freq.get(a);
21            int fb = freq.get(b);
22
23           // 1️⃣ frequency ASCENDING  
24          // 2️⃣ if same frequency → value DESCENDING
25
26            if(fa != fb){
27                return fa - fb;  //can also write by using if-else condition
28            }
29            
30            return b - a; //if(fa == fb), sort values in descending order
31        });
32
33        i = 0;
34        for(Integer it : arr){
35            nums[i++] = it;
36        }
37
38        return nums;
39    }
40}