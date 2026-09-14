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
        return reverseHelp(head, null);
    }
    
    private ListNode reverseHelp(ListNode current, ListNode prev){
        if(current == null) return prev;
        ListNode n = current.next;
        current.next = prev; 
        return reverseHelp(n, current);
    }
}
