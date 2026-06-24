// Last updated: 25/06/2026, 04:19:13
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
18    public int helper(TreeNode root){
19        if(root == null) return 0;
20
21        int leftHeight = helper(root.left);
22        int rightHeight = helper(root.right);
23
24        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
25
26        if(leftHeight == -1 || rightHeight == -1) return -1;
27
28        return 1 + Math.max(leftHeight, rightHeight);
29    }
30
31    public boolean isBalanced(TreeNode root) {
32        return helper(root) == -1 ? false : true;
33    }
34}