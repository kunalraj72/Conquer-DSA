// Last updated: 24/06/2026, 04:48:30
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18
19        Queue<TreeNode> q = new LinkedList<>();
20        List<List<Integer>> levelOrder = new ArrayList<>();
21        if(root == null) return levelOrder;
22
23        q.offer(root);
24
25        while(!q.isEmpty()){
26            int size = q.size();
27            List<Integer> temp = new ArrayList<>();
28            for(int i = 0; i < size; i++){
29                root = q.poll();
30                if(root.left != null){
31                    q.offer(root.left);
32                }
33                if(root.right != null){
34                    q.offer(root.right);
35                }
36                temp.add(root.val);
37            }
38            levelOrder.add(temp);
39        }
40        return levelOrder;
41    }
42}