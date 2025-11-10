// Last updated: 10/11/2025, 05:31:49
class Solution {
    //Brute Force: Using BackTracking
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        boolean[] seen = new boolean[26];
        Arrays.fill(seen, false);
        for(char c : s.toCharArray()) freq[c-'a']++;

        for(char c : s.toCharArray()){
            freq[c-'a']--;

            if(seen[c-'a']) continue;

            if(st.empty()){
                st.push(c);
            }else if(c > st.peek()){
                st.push(c);
            }else{
                while(!st.empty() && c < st.peek() && freq[st.peek() - 'a'] > 0){
                    seen[st.peek() - 'a'] = false;
                    st.pop();
                }
                st.push(c);
                
            }
            seen[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());

        return sb.reverse().toString();
    }
}

//reference: Techdose video