// Last updated: 22/05/2026, 02:07:14
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18         if(head == null){
19            return null;
20        }
21
22        // Original node -> Copied node
23        HashMap<Node, Node> map = new HashMap<>();
24
25        Node cur = head;
26
27        // PASS 1:
28        // Create copy nodes and store mapping
29        while(cur != null){
30
31            Node copyNode = new Node(cur.val);
32
33            map.put(cur, copyNode);
34
35            cur = cur.next;
36        }
37
38        cur = head;
39
40        // PASS 2:
41        // Connect next and random pointers
42        while(cur != null){
43
44            Node copyNode = map.get(cur);
45
46            // Set next pointer
47            copyNode.next = map.get(cur.next);
48
49            // Set random pointer
50            copyNode.random = map.get(cur.random);
51
52            cur = cur.next;
53        }
54
55        return map.get(head);
56    }
57}