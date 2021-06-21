/**
Problem Solver: gordon fang
Method: Iterative Method
Time Complexity: O(n)
Runtime: 20 ms, faster than 81.56% of C++ online submissions for Remove Linked List Elements.
Memory Usage: 15.3 MB, less than 11.13% of C++ online submissions for Remove Linked List Elements.
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50

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
    ListNode* removeElements(ListNode* head, int val) {
        if(head == NULL) {
            return head;
        }
        
        ListNode* node = head;
        
        while(node -> next != NULL) {
            if(node -> next -> val == val) {
                ListNode* temp = node -> next;
                node -> next = temp -> next;
                delete temp;
            } else {
                node = node -> next;
            }
        }
        
        if(head -> val == val) {
            ListNode* temp = head -> next;
            delete head;
            head = temp;
        }
        
        return head;
    }
};