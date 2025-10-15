// Last updated: 16/10/2025, 04:25:19
class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        int n = words.size();
        
        unordered_map<char,int>mp1;
        string word = words[0];
        for(int i=0;i<word.length();i++){
             mp1[word[i]]++;
        }
        unordered_map<char,int>mp2;
         for(int i=1;i<n;i++){
             string wordle = words[i];
             mp2.clear();
              
             for(int j=0;j<wordle.length();j++){
                  mp2[wordle[j]]++;
                 }
             
              for(auto it = mp1.begin(); it!=mp1.end();it++){
                   it->second = min(it->second,mp2[it->first]);
              }
           }
           int size = 0;
           for(auto it : mp1){
               size += it.second;
           }
          vector<string> ans;
        //   for(auto it : mp1){ 
        //      for(int k=0;k<it.second;k++){
        //          ans[k] = it.first;
        //      }
        //   }
        for(auto it:mp1) {
            string s = "";
            char x = it.first;
            for(int j=0;j<it.second;j++) {
                ans.push_back(s+x);
            }
        }

        return ans;
    }
};