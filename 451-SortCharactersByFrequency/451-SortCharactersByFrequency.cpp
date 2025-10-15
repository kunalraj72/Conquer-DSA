// Last updated: 16/10/2025, 04:27:00
#include<bits/stdc++.h>
class Solution {
public:
    string frequencySort(string s) {
        unordered_map<char,int> mp;
        priority_queue<pair<int,char>> pq;
        //maxHeap priority queue ka use isliye kar rahe hai kyuki  iska top hamesa highest                frequeny wala character ko store karega
        
        for(int i=0;i<s.length();i++){
            mp[s[i]]++;
        }
        for(auto it : mp){
            pq.push(make_pair(it.second,it.first));
            
            //ulta karke maxHeap me store kar rahe hai kyuki maxHeap use freq to store the                     element in ascending order i.e. max Frequency character on the top of maxHeap.
        }
        string res ="";
        
        while(!pq.empty()){
            res.append(pq.top().first,pq.top().second);
            //res.append(kitne bar, kon sa character)
            
            pq.pop();
        }
        return res;
    }
};