// Last updated: 21/05/2026, 03:24:22
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    // Utility function to calculate length of the list
13    private int listLength(ListNode head) {
14        int count = 0;
15        while (head != null) {
16            count++;
17            head = head.next;
18        }
19        return count;
20    }
21
22    public ListNode getKthNode(ListNode head, int k){
23        ListNode cur = head;
24        int i = 1;
25
26        while(cur != null && i < k){
27            cur = cur.next;
28            i++;
29        }
30        return cur;
31    }
32
33    public ListNode reverseList(ListNode head){
34        ListNode cur = head;
35        ListNode prev = null;
36        ListNode next = null;
37
38        while(cur != null){
39            next = cur.next;
40            cur.next = prev;
41            prev = cur;
42            cur = next;
43        }
44        return prev;
45    }
46
47    public ListNode reverseKGroup(ListNode head, int k) {
48        if (head == null || k > listLength(head)) return head;
49
50        ListNode prev = null;
51        ListNode curr = head;
52        ListNode next = null;
53        ListNode newListHead = getKthNode(head, k);
54        ListNode prevGroupTail = null;
55
56        while(head != null){
57            ListNode kthNode = getKthNode(head, k);
58            ListNode nextNode = null;
59            if(kthNode != null){
60                nextNode = kthNode.next;
61                kthNode.next = null;
62            }else{
63                break;
64            }
65            ListNode newHead = reverseList(head); //newList ka tail is old List head
66            if(prevGroupTail != null) prevGroupTail.next = newHead; //prev group k sath joda
67            head.next = nextNode; // next group k sath joda
68            prevGroupTail = head;
69            head = head.next; //next group head
70        }
71        return newListHead;
72    }
73}