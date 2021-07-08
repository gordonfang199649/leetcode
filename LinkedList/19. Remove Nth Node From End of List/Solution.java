/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth
 * Node From End of List. Memory Usage: 39.2 MB, less than 5.33% of Java online
 * submissions for Remove Nth Node From End of List.
 * 
 * Time Complexity: O(2n)
 * problem solver; Gordon Fang
 * 
 * Given the head of a linked list, remove the nth node from the end of the list
 * and return its head.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [1,2,3,4,5], n = 2 Output: [1,2,3,5] Example 2:
 * 
 * Input: head = [1], n = 1 Output: [] Example 3:
 * 
 * Input: head = [1,2], n = 1 Output: [1]
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the list is sz. 1 <= sz <= 30 0 <= Node.val <= 100 1
 * <= n <= sz Definition for singly-linked list. public class ListNode { int
 * val; ListNode next; ListNode() {} ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getListSize(head);

        if (size == n)
            return head.next;

        ListNode cur = head;
        for (int i = 0; i < size - n - 1; i++)
            cur = cur.next;
        cur.next = cur.next.next;

        return head;
    }

    private int getListSize(ListNode head) {
        ListNode node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }
}