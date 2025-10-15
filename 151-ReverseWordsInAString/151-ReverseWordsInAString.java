// Last updated: 16/10/2025, 04:28:49
class Solution {
    public String reverseWords(String s) {

        //we can use "\s+" also instead of " +" to match any number of whitespaces.
        String[] word = s.split(" +"); 
        StringBuilder res = new StringBuilder("");

        for(int i=word.length-1;i>=0;i--){
            res = res.append(word[i] + " ");
        }
        return res.toString().trim();
    }
}