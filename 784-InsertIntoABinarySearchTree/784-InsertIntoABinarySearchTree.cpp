// Last updated: 16/10/2025, 04:25:56
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
    TreeNode* insertIntoBST(TreeNode* root, int key) {
    if(root == NULL){
        TreeNode *root = new TreeNode(key);
        return root;
    }
    if(root->val == key){
        return root;
    }
    else if(root->val < key){
        root->right = insertIntoBST(root->right,key);
    }
    else{
        root->left = insertIntoBST(root->left,key);
    }
    return root;
    }
};