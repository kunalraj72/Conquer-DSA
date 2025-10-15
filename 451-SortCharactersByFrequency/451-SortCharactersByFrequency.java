// Last updated: 16/10/2025, 04:26:53
class Solution {
    //Using Bucket Sort Algorithm : (TC: O(n + k) ans SC: O(n + k))
    public String frequencySort(String s) {
        int n = s.length();
        Map<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        //create an array of Lists (buckets) of size (n +1) since 0 is always unused
        List<Character>[] buckets = new List[n + 1];
        for (int i = 0; i <= n; i++) buckets[i] = new ArrayList<>();

        //Place characters into buckets
        for(Map.Entry<Character, Integer> entry : mp.entrySet()){
            char c = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(c);
        }
        
        StringBuilder res = new StringBuilder();
        
        for(int i = n; i>= 1; i--){
            for(char c: buckets[i]){
                for(int j = 0; j < i; j++){
                    res.append(c);
                }
            }
        }
       
        return res.toString();
    }
}