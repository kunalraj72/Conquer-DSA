// Last updated: 26/06/2026, 02:39:30
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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        if(p == null || q == null){
19            return p == q;
20        }
21
22        boolean isCurNodeSame = (p.val == q.val) ? true : false;
23
24        boolean isLeftChildSame = isSameTree(p.left, q.left);
25        boolean isRightChildSame = isSameTree(p.right, q.right);
26
27        return isCurNodeSame && isLeftChildSame && isRightChildSame;
28    }
29}