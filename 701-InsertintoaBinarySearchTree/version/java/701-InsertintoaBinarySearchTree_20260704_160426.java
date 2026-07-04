// Last updated: 04/07/2026, 16:04:26
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
17    public void helper(TreeNode root, int val){
18        
19    }
20    public TreeNode insertIntoBST(TreeNode root, int val) {
21        if(root == null){
22            root = new TreeNode(val);
23            return root;
24        }
25
26        if(val < root.val){
27            root.left = insertIntoBST(root.left, val);
28        }else{
29            root.right = insertIntoBST(root.right, val);
30        }
31        return root;
32    }
33}