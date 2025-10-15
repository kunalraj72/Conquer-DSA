// Last updated: 16/10/2025, 04:27:02
// Video Link: https://www.youtube.com/watch?v=gqXU1UyA8pk

class Solution {
public:
    int characterReplacement(string S, int K) {
        int n = S.size();
        unordered_map<char,int> charFreq;
        int start = 0, end = 0;
        int maxLen = 0;
        int maxRepeatLetterCount = 0;
        while(end < n){
            char ch = S[end];
            charFreq[ch]++;
            maxRepeatLetterCount = max(maxRepeatLetterCount,charFreq[ch]);
            
            if(end - start +1 - maxRepeatLetterCount > K){
                charFreq[S[start]]--;
                start++;
            }
            
            maxLen = max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }
};