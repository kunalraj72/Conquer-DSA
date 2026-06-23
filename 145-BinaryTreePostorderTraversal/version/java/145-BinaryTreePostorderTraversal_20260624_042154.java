// Last updated: 24/06/2026, 04:21:54
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    public List<Integer> postorderTraversal(TreeNode root) {
19
20        List<Integer> ans = new ArrayList<>();
21        Stack<TreeNode> st = new Stack<>();
22        Stack<Integer> st2 = new Stack<>();
23        if(root == null){
24            return ans;
25        }
26        st.push(root);
27
28        while(!st.isEmpty()){
29            root = st.pop();
30            st2.push(root.val);
31            
32            if(root.left != null){
33                st.push(root.left);
34            }
35            if(root.right != null){
36                st.push(root.right);
37            }
38        }
39
40        while(!st2.isEmpty()){
41            ans.add(st2.pop());
42        }
43        return ans;
44    }
45}