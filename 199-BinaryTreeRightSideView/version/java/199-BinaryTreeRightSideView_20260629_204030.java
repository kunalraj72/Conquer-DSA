// Last updated: 29/06/2026, 20:40:30
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
18    List<Integer> ans = new ArrayList<>();
19
20    public List<Integer> rightSideView(TreeNode root) {
21        dfs(root, 0);
22        return ans;
23    }
24
25    void dfs(TreeNode root, int level) {
26
27        if (root == null)
28            return;
29
30        // First node encountered at this level
31        if (level == ans.size()) {
32            ans.add(root.val);
33        }
34
35        // Visit right subtree first
36        dfs(root.right, level + 1);
37
38        // Then left subtree
39        dfs(root.left, level + 1);
40    }
41}