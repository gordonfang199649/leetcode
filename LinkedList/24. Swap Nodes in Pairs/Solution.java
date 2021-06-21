/**
Problem Solver: gordon fang
Method: Iterative Method
Time Complexity: O(n)
Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
Memory Usage: 36.4 MB, less than 72.21% of Java online submissions for Swap Nodes in Pairs.
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 

Example 1:


Input: head = [1,2,3,4]
Output: [2,1,4,3]
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [1]
Output: [1]
 

Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100

* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) { val = x; }
* }
*/

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        while(node!=null && node.next!=null){
            int temp = node.val;
            node.val = node.next.val;
            node.next.val =temp;
            node = node.next.next;
        }
        return head;
    }
}