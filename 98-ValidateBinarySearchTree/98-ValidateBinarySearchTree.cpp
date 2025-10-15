// Last updated: 16/10/2025, 04:29:39
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
    
    bool isBST(TreeNode *root, long maxi, long mini){
        if(!root){
            return true;
        }
        if(root->val <= mini || root->val >= maxi){
            return false;
        }
        
        return (isBST(root->left,root->val,mini) && isBST(root->right,maxi,root->val));
    }
    
    bool isValidBST(TreeNode* root) {
        long mini = LONG_MIN;
        long maxi = LONG_MAX;
        return isBST(root,maxi,mini);
    }
};