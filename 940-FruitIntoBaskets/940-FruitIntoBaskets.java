// Last updated: 16/10/2025, 04:25:39
class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int i = 0;
        int j = 0;
        int k = 2; // Only 2 baskets (Only 2 types of fruit allowed)
        int maxFruit = 0;
        if(n < k){
            return n;
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        //Once u understood the problem statement, it's quite similar to Largest substring with k unique characters.
        while(j < n){
            
            mp.put(fruits[j],mp.getOrDefault(fruits[j], 0) + 1); //putting jth fruit into map increment its count
            
            if(mp.size() > k){ // when this occur, start removing the calculations for i and do i++
                while(mp.size() > k){
                   mp.put(fruits[i], mp.getOrDefault(fruits[i], 0) - 1);
                   if(mp.get(fruits[i]) == 0){
                      mp.remove(fruits[i]);
                   }
                   i++; 
                }
            }
            if(mp.size() <= k){ // mp.size() represents the number of unique Fruits, its <= because we can have only one type of fruits available to put inside both the baskets, ex. fruits: [1,1]
                maxFruit = Math.max(j - i + 1, maxFruit);
            }
            j++;
        }
        return maxFruit;
    }
}