// Last updated: 01/07/2026, 02:23:42
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
18    class Info{
19        TreeNode node;
20        int index;
21
22        Info(TreeNode node, int index){
23            this.node = node;
24            this.index = index;
25        }
26    }
27
28    public int widthOfBinaryTree(TreeNode root) {
29        if(root == null) return 0;
30        int max_width = 0;
31        Queue<Info> q = new ArrayDeque();
32        q.offer(new Info(root, 1));
33        while(!q.isEmpty()){
34            int size = q.size();
35            int min_ind = q.peek().index;
36            int first = 0;
37            int last = 0;
38
39            for(int i = 0; i < size; i++){
40                int cur_ind = q.peek().index - min_ind;
41                TreeNode node = q.poll().node;
42                if(i == 0) first = cur_ind;
43                if(i == size - 1) last = cur_ind;
44                if(node.left != null){
45                    q.offer(new Info(node.left, 2 * cur_ind + 1));
46                }
47                if(node.right != null){
48                    q.offer(new Info(node.right, 2 * cur_ind + 2));
49                }
50            }
51            max_width = Math.max(max_width, last - first + 1);
52        }
53        return max_width;
54    }
55}