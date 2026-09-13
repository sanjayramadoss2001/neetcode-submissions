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
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode start = head;
        ListNode nxt = head.next;
        start.next = null;
        while(nxt != null) {
            ListNode ref = nxt;
            nxt = nxt.next;
            ref.next = start;
            start = ref;
        }
        return start;
    }
}
