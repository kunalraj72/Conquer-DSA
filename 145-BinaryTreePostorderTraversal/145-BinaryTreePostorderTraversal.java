// Last updated: 16/10/2025, 04:28:58
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

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        if(root == null){
            return ans;
        }
        st.push(root);

        while(!st.isEmpty()){
            root = st.pop();
            st2.push(root.val);
            
            if(root.left != null){
                st.push(root.left);
            }
            if(root.right != null){
                st.push(root.right);
            }
        }

        while(!st2.isEmpty()){
            ans.add(st2.pop());
        }
        return ans;
    }
}