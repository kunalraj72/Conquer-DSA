// Last updated: 14/06/2026, 05:19:39
1class Solution {
2
3    //First Try to draw Recursive ree, if not able to do so then see tree diagram in note, then also not of to implement then see code with mik video explanation
4    public void helper(StringBuilder temp, String digits, int idx, HashMap<Character, String> mp, List<String> ans){
5
6        if(idx >= digits.length()){
7            ans.add(temp.toString());
8            return;
9        }
10
11        String str =  mp.get(digits.charAt(idx));
12        for(int j = 0; j < str.length(); j++){
13            temp.append(str.charAt(j));    //Do
14            helper(temp, digits, idx + 1, mp, ans); //Explore
15            temp.deleteCharAt(temp.length() - 1); //Undo
16        }
17    }
18
19    public List<String> letterCombinations(String digits) {
20        int n = digits.length();
21        if(n == 0) return new ArrayList<>();
22        HashMap<Character, String> mp = new HashMap<>();
23        mp.put('2', "abc");
24        mp.put('3', "def");
25        mp.put('4', "ghi");
26        mp.put('5', "jkl");
27        mp.put('6', "mno");
28        mp.put('7', "pqrs");
29        mp.put('8', "tuv");
30        mp.put('9', "wxyz");
31        
32        List<String> ans = new ArrayList<String>();
33        StringBuilder temp = new StringBuilder();
34        helper(temp, digits, 0, mp, ans);
35        return ans;
36    }
37}