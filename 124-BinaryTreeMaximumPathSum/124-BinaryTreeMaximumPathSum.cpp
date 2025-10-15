// Last updated: 16/10/2025, 04:29:12
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
    
    int dfsHeight(TreeNode* root,int& maxi){
        if(root == NULL) return 0;
        
        int leftSum = max(0,dfsHeight(root->left,maxi));
        int rightSum = max(0,dfsHeight(root->right,maxi));
        
        maxi = max(maxi,root->val + leftSum + rightSum);
        return root->val + max(leftSum,rightSum);
    }
    
    int maxPathSum(TreeNode* root) {
        int maxi = -1e9;
        dfsHeight(root,maxi);
        return maxi;
    }
};