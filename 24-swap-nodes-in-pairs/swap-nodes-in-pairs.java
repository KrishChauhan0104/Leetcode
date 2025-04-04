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
    public ListNode swapPairs(ListNode head) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode curr = prev;
        while(curr.next!=null && curr.next.next!=null){
            ListNode first = curr.next;
            ListNode second = curr.next.next;

            first.next = second.next;
            second.next = first;
            curr.next = second;

            curr = first;
        }

        return prev.next;
    }
}