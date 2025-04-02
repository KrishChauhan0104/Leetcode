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
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode curr = prev;
        ListNode nt = prev;

        for(int i=0; i<=n; i++){
            curr = curr.next;
        }
        while(curr!=null){
            curr = curr.next;
            nt = nt.next;
        }
        nt.next = nt.next.next;
        return prev.next;
    }
}