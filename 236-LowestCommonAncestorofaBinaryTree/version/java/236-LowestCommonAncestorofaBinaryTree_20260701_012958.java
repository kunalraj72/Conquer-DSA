// Last updated: 01/07/2026, 01:29:58
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if(root == null || root == p || root == q) return root;
13
14        TreeNode left = lowestCommonAncestor(root.left,p,q);
15        TreeNode right = lowestCommonAncestor(root.right,p,q);
16
17        if(left == null && right == null) return null;
18        if(left == null) return right;
19        if(right == null) return left;
20        else return root; //this is the lowest common ancestor of p & q.
21    }
22}