// Last updated: 16/10/2025, 04:28:09
class Solution {

    public boolean isValid(String s){
        if(s.charAt(0) == '0' || Integer.parseInt(s) > 255){
            return false;
        }
        return true;
    }
  
    public void helper(String s, int i, int partn, String ans, List<String> res){

        if(i == s.length() || partn == 4){
            if(i == s.length() && partn == 4) res.add(ans.substring(0, ans.length() - 1));
            return;
        }

        helper(s, i + 1, partn + 1, ans + s.charAt(i) + '.', res);

        if(i + 2 <= s.length() && isValid(s.substring(i, i + 2))){
            helper(s, i + 2, partn + 1, ans + s.substring(i, i + 2) + '.', res);
        }
        if(i + 3 <= s.length() && isValid(s.substring(i, i + 3))) {
            helper(s, i + 3, partn + 1, ans + s.substring(i, i + 3) + '.', res);
        }
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        helper(s, 0, 0, "", res);
        return res;
    }
}