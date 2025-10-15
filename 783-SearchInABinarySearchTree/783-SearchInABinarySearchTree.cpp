// Last updated: 16/10/2025, 04:25:59
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
    TreeNode *ans;
    TreeNode* searchBST(TreeNode* root, int x) {
    if(root == NULL) return NULL;
    
    if(root->val == x){
        ans = root;
    }
    
    else if(x < root->val){
        searchBST(root->left,x);
    }else{
        searchBST(root->right,x);
    }
        return ans;
    }
};