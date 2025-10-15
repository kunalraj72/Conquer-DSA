// Last updated: 16/10/2025, 04:26:15
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
    void inorder(TreeNode* root,vector<int>&v)
    {
        if(root==NULL)
        return;

        inorder(root->left,v);
        v.push_back(root->val);
        inorder(root->right,v);
    }
    
    bool findTarget(TreeNode* root, int k) {
        vector<int> v;
        inorder(root,v);
        
        unordered_map<int,int> mp;
        for(auto it : v){
            int b = k - it;
            if(mp.find(b) != mp.end()){
                return 1;
            }
            mp[it]++;
        }
        return 0;
    }
};