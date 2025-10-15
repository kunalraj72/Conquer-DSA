// Last updated: 16/10/2025, 04:31:26
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head == NULL) return head;
        if(head->next == NULL){
            if(n == 1) return NULL;
        }
        ListNode * cur = head;
        int count = 0;
        while(cur != NULL){
            cur = cur->next;
            count++;
        }
        int destination = count - n;
        if(destination == 0){
            return head->next;
        }
        ListNode *prev = NULL;
        cur = head;
        int manzilPassHai = 0;
        while(cur != NULL){
            prev = cur;
            cur = cur->next;
            manzilPassHai++;
            if(manzilPassHai == destination){
                prev->next = cur->next;
            }
        }
        return head;
    }
};