// Last updated: 02/07/2026, 02:18:55
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
17    public int countNodes(TreeNode root) {
18
19        if(root == null) return 0;
20
21        int lh = leftHeight(root);
22        int rh = rightHeight(root);
23
24        if(lh == rh){
25            return (int) Math.pow(2, lh) - 1;
26        }
27
28        return 1 + countNodes(root.left) + countNodes(root.right);
29    }
30
31    public int leftHeight(TreeNode root){
32        if(root == null) return 0;
33
34        return 1 + leftHeight(root.left);
35    }
36
37    public int rightHeight(TreeNode root){
38        if(root == null) return 0;
39
40        return 1 + rightHeight(root.right);
41    }
42}