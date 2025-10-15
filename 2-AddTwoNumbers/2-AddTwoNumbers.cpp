// Last updated: 16/10/2025, 04:31:55
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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummy = new ListNode(-1);
        ListNode *temp = dummy;
        ListNode *ptr1 = l1;
        ListNode *ptr2 = l2;
        int carry = 0;
            while(ptr1 != NULL || ptr2 != NULL || carry){
                int sum = 0;
                if(ptr1 != NULL){
                    sum += ptr1->val;
                    ptr1 = ptr1->next;
                }
                if(ptr2 != NULL){
                    sum += ptr2->val;
                    ptr2 = ptr2->next;
                }
                
                sum += carry;
                carry = sum/10;
                ListNode *newNode = new ListNode(sum%10);
                temp->next = newNode;
                temp = temp->next;
            }
        return dummy->next;
    }
};