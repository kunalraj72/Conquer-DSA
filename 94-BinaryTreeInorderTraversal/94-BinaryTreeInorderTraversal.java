// Last updated: 16/10/2025, 04:29:42
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        while(root != null || !st.isEmpty()){
            
            //moving towards extreme left
            while(root != null){
                st.push(root);
                root = root.left;
            }
            //root
            root = st.pop();
            ans.add(root.val);

            //moving towards right children
            root = root.right;

        }

        return ans;
    }
}