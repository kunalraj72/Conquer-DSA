// Last updated: 05/07/2026, 03:45:01
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if(root == null) return null;
14        while(true){
15            if(root.val > p.val && root.val > q.val){
16                root = root.left;
17            }else if(root.val < p.val && root.val < q.val){
18                root = root.right;
19            }else{
20                return root;
21            }
22        }
23    }
24}