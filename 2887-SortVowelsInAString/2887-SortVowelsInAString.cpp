// Last updated: 16/10/2025, 04:24:03
#include<bits/stdc++.h>
class Solution {
public:
    string sortVowels(string s) {
        int n = s.length();
        string vowel = "";
        for(int i=0;i<n;i++){
            if(s[i] == 65 || s[i] == 69 || s[i] == 73 || s[i] == 79 || s[i] == 85 || s[i] == 97 || s[i] == 101 || s[i] == 105 || s[i] == 111 || s[i] == 117){
                vowel += s[i];
            }
        }
        
        priority_queue<pair<int,char>,vector<pair<int,char>>, greater<pair<int,char>>> pq;
        for(int i=0;i<vowel.length();i++){
            pq.push({vowel[i],vowel[i]});
        }
        for(int i=0;i<n;i++){
            if(s[i] == 65 || s[i] == 69 || s[i] == 73 || s[i] == 79 || s[i] == 85 || s[i] == 97 || s[i] == 101 || s[i] == 105 || s[i] == 111 || s[i] == 117){
                s[i] = pq.top().second;
                pq.pop();
            }
        }
        return s;
    }
};