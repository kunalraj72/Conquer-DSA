// Last updated: 27/06/2026, 03:06:29
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
17    HashMap<Integer, List<int[]>> data = new HashMap<>();//<vertical, <level, node.val>>
18    public List<List<Integer>> verticalTraversal(TreeNode root) {
19        preorder(root, 0, 0); //preorder(root, level, vertical)
20        List<List<Integer>> result = new ArrayList<>();
21        List<Integer> verticals = new ArrayList<>(data.keySet());
22        Collections.sort(verticals);
23        for(int col : verticals){
24            List<int[]> nodes = data.get(col);
25            Collections.sort(nodes, (a, b) ->{
26                if(a[0] == b[0]){
27                    return a[1] - b[1]; //smaller node.val  will come first if levels and verticals both are same
28                }else{
29                    return a[0] - b[0]; //if levels are different but verticals are same then samller level will come first
30                }
31            });
32            List<Integer> columnResult = new ArrayList<>();
33            for(int [] node : nodes){
34                columnResult.add(node[1]);
35            }
36            result.add(columnResult);
37        }
38
39        return result;
40    }
41
42    public void preorder(TreeNode root, int level, int vertical){
43        if(root == null) return;
44
45        if (!data.containsKey(vertical)) {
46            ArrayList<int[]> list = new ArrayList<>();
47            list.add(new int[]{level, root.val});
48            data.put(vertical, list);
49        } else {
50            data.get(vertical).add(new int[]{level, root.val});
51        }
52        
53        preorder(root.left, level + 1, vertical - 1);
54        preorder(root.right, level + 1, vertical + 1);
55    }
56}