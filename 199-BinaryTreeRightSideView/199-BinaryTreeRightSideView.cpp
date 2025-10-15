// Last updated: 16/10/2025, 04:28:14
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
    
    vector<int> ans;
    void RightView(TreeNode* root, int level){
         if(root == NULL) return;
        
         if(level == ans.size()) ans.push_back(root->val);
        
         RightView(root->right,level+1);
         RightView(root->left,level+1);
    }
    
    vector<int> rightSideView(TreeNode* root) {
        RightView(root,0);
        return ans;
    }
};