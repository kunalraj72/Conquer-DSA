// Last updated: 16/10/2025, 04:28:38
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *cur1 = headA;
        ListNode *cur2 = headB;
        int cnt1 = 0;
        int cnt2 = 0;
        while(cur1 != NULL){
            cur1 = cur1->next;
            cnt1++;
        }
        while(cur2 != NULL){
            cur2 = cur2->next;
            cnt2++;
        }
        int diff = abs(cnt1 - cnt2);
        int count = 0;
        cur1 = headA;
        cur2 = headB;
        if(cnt1 > cnt2){
            while(count != diff){
                cur1 = cur1->next;
                count++;
            }
        }
        else{
            while(count != diff){
                cur2 = cur2->next;
                count++;
            }
        }
        while(cur1 != NULL && cur1 != cur2){
            cur1 = cur1->next;
            cur2 = cur2->next;
        }
        if(cur1 != NULL){
            return cur1;
        }
        return NULL;
    }
};