// Last updated: 16/10/2025, 04:31:21
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
    
    ListNode* mergeTwoLists(ListNode* left, ListNode* right) {
         if(left == NULL){
        return right;
    }

    if(right == NULL){
        return left;
    }

    ListNode* dummy = new ListNode(-1);
    ListNode* temp = dummy;

    while(left != NULL && right != NULL){
        if(left -> val < right -> val){
            temp -> next = left;
            temp = left;
            left = left -> next;
        }
        else{
            temp -> next = right;
            temp = right;
            right = right -> next;
        }
    }

    while(left != NULL){
        temp -> next = left;
        temp = left;
        left = left -> next;
    }

    while(right != NULL){
        temp -> next = right;
        temp = right;
        right = right -> next;
    }

    ListNode *ans = dummy -> next;
    return ans;

    }
};