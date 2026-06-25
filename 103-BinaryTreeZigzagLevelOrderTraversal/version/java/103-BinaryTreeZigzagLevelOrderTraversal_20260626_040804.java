// Last updated: 26/06/2026, 04:08:04
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if(root == null) return ans;
20
21        Queue<TreeNode> q = new ArrayDeque<>();
22        q.offer(root);
23
24        boolean leftToRight = true;
25
26        while(!q.isEmpty()){
27            int size = q.size();
28            int [] level = new int[size];
29            for(int i = 0; i < size; i++){
30                root = q.poll();
31                int index = leftToRight ? i : size - i - 1;
32                if(root.left != null){
33                    q.offer(root.left);
34                }
35                if(root.right != null){
36                    q.offer(root.right);
37                }
38                level[index] = root.val;
39            }
40            ans.add(Arrays.stream(level).boxed().toList());
41            leftToRight = !leftToRight;
42        }
43        return ans;
44    }
45}