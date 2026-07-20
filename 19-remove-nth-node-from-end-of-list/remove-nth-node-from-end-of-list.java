/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        if (length == n) {
            return head.next;
        } 
        ListNode h = head;
        for (int i = 0; i < length - n - 1; i++) {
            h = h.next;
        } 
        h.next = h.next.next;

        return head;
    }
}