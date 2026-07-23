// Last updated: 23/07/2026, 05:37:18
1class Solution {
2    
3    public String frequencySort(String s) {
4        Map<Character, Integer> freq = new HashMap<>();
5
6       // count frequency
7       for(char c : s.toCharArray()) {
8         freq.put(c, freq.getOrDefault(c, 0) + 1);
9       }
10
11       // put unique characters in list
12       List<Character> uniqueChars = new ArrayList<>(freq.keySet());
13
14       // Comparator Sort
15       Collections.sort(uniqueChars,
16            Comparator.comparing(c -> freq.get(c)).reversed());
17
18       // Storing answer in StringBuilder
19       StringBuilder sb = new StringBuilder();
20       for(Character c : uniqueChars){
21           int charFreq = freq.get(c);
22           while(charFreq-- > 0){
23               sb.append(c);
24           }
25       }
26
27       return sb.toString();
28    }
29}