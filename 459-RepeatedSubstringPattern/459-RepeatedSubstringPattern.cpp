// Last updated: 16/10/2025, 04:26:50
class Solution {
public:
    
// Using the 'substr' function, a substring of the concatenated string is extracted. The starting index is 1, and the length is '(2 * s.size() - 2)'.

// The 'find' function is then used to search for the original string s within the extracted substring. If the substring contains 's', the result will be a non-negative index. If 's' is not found, the result will be '-1'.

// The '!= -1' comparison checks if the 'find' function found the original string 's' within the substring.

// The result of this comparison (whether the substring contains s) is returned as the result of the 'repeatedSubstringPattern' function.
    
    
    bool repeatedSubstringPattern(string s) {
        
        return (s+s).substr(1,2*s.size()-2).find(s)!=-1;  //Do dry run u will understand
    }
};