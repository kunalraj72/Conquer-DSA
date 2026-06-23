// Last updated: 24/06/2026, 03:31:26
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
18    public void helper(TreeNode root, List<Integer> inorder){
19
20        if(root == null) return;
21        
22        helper(root.left, inorder);
23        inorder.add(root.val);
24        helper(root.right, inorder);
25    }
26
27    public List<Integer> inorderTraversal(TreeNode root) {
28        
29        List<Integer> inorder = new ArrayList<>();
30        helper(root, inorder);
31
32        return inorder;
33    }
34}