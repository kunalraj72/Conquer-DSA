// Last updated: 14/02/2026, 21:07:22
1class Solution {
2    public String longestPalindrome(String s) {
3        int n = s.length();
4        if(n <= 1) return s;
5        String LPS = "";
6
7        for(int i = 0; i < n; i++){
8            //consider odd length palindrome
9            int low = i;
10            int high = i;
11
12           while(s.charAt(low) == s.charAt(high)){
13            low--;
14            high++;
15            if(low == -1 || high == n){
16                break;
17            }
18           }
19            String palindrome = s.substring(low + 1, high);
20            if(palindrome.length() > LPS.length()){
21                LPS = palindrome;
22            }
23
24            //consider even length palindrome
25            low = i - 1;
26            high = i;
27             while(low >= 0 && s.charAt(low) == s.charAt(high)){
28                low--;
29                high++;
30                if(low == -1 || high == n){
31                    break;
32                }
33            }
34            palindrome = s.substring(low + 1, high);
35            if(palindrome.length() > LPS.length()){
36                LPS = palindrome;
37            }
38        }
39        return LPS;
40    }
41}