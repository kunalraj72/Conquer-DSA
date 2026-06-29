// Last updated: 29/06/2026, 20:34:48
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
17    class Info{
18        TreeNode node;
19        int  level;
20        
21        Info(TreeNode node, int level){
22            this.node = node;
23            this.level = level;
24        }
25    }
26
27
28    public List<Integer> rightSideView(TreeNode root) {
29        // code here
30        ArrayList<Integer> ans = new ArrayList<>();
31        if(root == null) return ans;
32        Queue<Info> q = new ArrayDeque<>();
33        TreeMap<Integer, TreeNode> mp = new TreeMap<>();
34        
35        q.offer(new Info(root, 0));
36        
37        while(!q.isEmpty()){
38            int size = q.size();
39
40            for(int i=0;i<size;i++){
41                Info curNode = q.poll();
42                TreeNode node = curNode.node;
43                int level = curNode.level;
44                if(i == size - 1){
45                    ans.add(node.val);
46                }
47                if(node.left != null){
48                    q.offer(new Info(node.left, level + 1));
49                }
50            
51                if(node.right != null){
52                    q.offer(new Info(node.right, level + 1));
53                }
54            } 
55        }
56        return ans;
57    }
58}