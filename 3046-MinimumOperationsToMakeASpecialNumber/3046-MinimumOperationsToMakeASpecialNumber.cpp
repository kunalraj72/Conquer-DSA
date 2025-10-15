// Last updated: 16/10/2025, 04:23:49
class Solution {
public:
    int minimumOperations(string s) {
        int ans = INT_MAX; 
        int N = s.size(); 
        if(N == 1){ 
            return 1; 
        } 
        else if(N == 2){ 
            if(s == "25" || s == "50" ||  s == "75" || s == "00"){ 
                return 0; 
            }else if(s[0] == '0' || s[1] == '0'){ 
                return 1; 
            }else{ 
                return 2; 
            } 
        } 
        int cnt = count(s.begin(), s.end(), '0'); 
    for (int i = 0; i < N; i++) { 
        for (int j = i + 1; j < N; j++) { 
 
            int num = (s[i] - '0')* 10 + (s[j] - '0'); 
            if (num % 25 == 0) { 
                int a = j - i - 1; 
                int b = N - (j + 1); 
                ans = min(ans, a+b); 
            } 
        } 
    } 
  
    return ans == INT_MAX ? N-cnt : ans; 
    }
};