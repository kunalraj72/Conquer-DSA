// Last updated: 17/05/2026, 19:20:56
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
12
13    public ListNode reverseList(ListNode head){
14
15        if(head == null) return null;
16        ListNode cur = head;
17        ListNode prev = null;
18        ListNode next = null;
19
20        while(cur != null){
21            next = cur.next;
22            cur.next = prev;
23            prev = cur;
24            cur = next;
25        }
26        return prev;
27    }
28
29    public boolean isPalindrome(ListNode head) {
30        ListNode slow = head;
31        ListNode fast = head;
32        ListNode prev = null;
33
34        if(head == null || head.next == null){
35            return true;
36        }
37
38        while(fast != null && fast.next != null){
39            slow = slow.next;
40            fast = fast.next.next;
41        }
42        //handling odd List scenario Ex. 121 (very important edge case) 
43        if(fast != null){
44            slow = slow.next;
45        }
46
47        ListNode secondHalf = reverseList(slow);
48        ListNode firstHalf = head;
49        while(firstHalf != slow && secondHalf != null){
50            if(firstHalf.val != secondHalf.val){
51                return false;
52            }
53            firstHalf = firstHalf.next;
54            secondHalf = secondHalf.next;
55        }
56        return true;
57    }
58}