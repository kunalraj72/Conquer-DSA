// Last updated: 16/10/2025, 04:27:42
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* n1, TreeNode* n2) {
        if(root == NULL){
            return NULL;
        }
        while(true){
            if(root->val < n1->val && root->val < n2->val){
                root = root->right;
            }
            else if(root->val > n1->val && root->val > n2->val){
               root = root->left;
            }
            else{
                return root;
            }
        }
        
    }
};