// Last updated: 10/02/2026, 03:55:15
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int n = fruits.length;
4        int i = 0;
5        int j = 0;
6        int k = 2; // Only 2 baskets (Only 2 types of fruit allowed)
7        int maxFruit = 0;
8        if(n < k){
9            return n;
10        }
11        HashMap<Integer,Integer> mp = new HashMap<>();
12        //Once u understood the problem statement, it's quite similar to longest subarray with atmost k unique elements.
13        while(j < n){
14            
15            mp.put(fruits[j],mp.getOrDefault(fruits[j], 0) + 1); //putting jth fruit into map increment its count
16            
17            if(mp.size() > k){ // when this occur, start removing the calculations for i and do i++
18                while(mp.size() > k){
19                   mp.put(fruits[i], mp.getOrDefault(fruits[i], 0) - 1);
20                   if(mp.get(fruits[i]) <= 0){
21                      mp.remove(fruits[i]);
22                   }
23                   i++; 
24                }
25            }
26            if(mp.size() <= k){ // mp.size() represents the number of unique Fruits, its <= because we can have only one type of fruits available to put inside both the baskets, ex. fruits: [1,1]
27                maxFruit = Math.max(j - i + 1, maxFruit);
28            }
29            j++;
30        }
31        return maxFruit;
32    }
33}