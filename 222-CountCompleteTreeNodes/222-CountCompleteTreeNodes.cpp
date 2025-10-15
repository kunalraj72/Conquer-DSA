// Last updated: 16/10/2025, 04:27:55
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
   int countNodes(TreeNode* root) {
      if(root == NULL) return 0;
      
      int lh = leftHeight(root);
      int rh = rightHeight(root);
      
      if(lh == rh) return pow(2,lh) - 1;
      
      return 1 + countNodes(root->left) + countNodes(root->right);
    }
    
    int leftHeight(TreeNode *node){
        int hght = 0;
        while(node != NULL){
            hght++;
            node = node->left;
        }
        return hght;
    }
    
    int rightHeight(TreeNode *node){
        int hght = 0;
        while(node != NULL){
            hght++;
            node = node->right;
        }
        return hght;
    }
};