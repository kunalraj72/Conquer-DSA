// Last updated: 16/10/2025, 04:29:36
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
    bool isSymmetricHelp(TreeNode *L, TreeNode *R){
        if(L == NULL || R==NULL) return L==R;
        
        if(L->val != R->val) return false;
        
        return isSymmetricHelp(L->left,R->right) && isSymmetricHelp(L->right,R->left);
    }
    
    bool isSymmetric(TreeNode* root) {
        return root == NULL || isSymmetricHelp(root->left,root->right);
    }
};