// Last updated: 16/10/2025, 04:25:23
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        map<int,map<int,multiset<int>>> nodes;
        queue<pair<TreeNode*, pair<int,int>>> q;
        q.push({root,{0,0}});
        while(!q.empty()){
            auto p = q.front();
            q.pop();
            TreeNode* noddie = p.first;
            int x = p.second.first;
            int y = p.second.second;
            nodes[x][y].insert(noddie->val);
            if(noddie->left){
                q.push({noddie->left,{x-1,y+1}});
            }
            if(noddie->right){
                q.push({noddie->right,{x+1,y+1}});
            }
        }
        
        vector<vector<int>>ans;
        for(auto it1 : nodes){
            vector<int> col;
            for(auto it2 : it1.second){
                col.insert(col.end(),it2.second.begin(),it2.second.end());
                //yaha Doubt hai
            }
            ans.push_back(col);
        }
        return ans;
    }
};