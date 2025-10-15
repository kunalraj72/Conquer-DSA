// Last updated: 16/10/2025, 04:26:25
class Solution {
public:
    int nextGreaterElement(int n) {
    string s=to_string(n);
    next_permutation(s.begin(), s.end());
    long long t;
    t=stol(s);
    if(t>INT_MAX or t<=n)return -1;
    return t; 
    }
};