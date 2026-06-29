// Last updated: 29/06/2026, 20:20:50
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
38            Info curNode = q.poll();
39            TreeNode node = curNode.node;
40            int level = curNode.level;
41            
42            
43            mp.put(level, node);
44            
45            if(node.left != null){
46                q.offer(new Info(node.left, level + 1));
47            }
48            
49            if(node.right != null){
50                q.offer(new Info(node.right, level + 1));
51            }
52        }
53        
54        for(TreeNode node : mp.values()){
55            ans.add(node.val);
56        }
57        return ans;
58    }
59}