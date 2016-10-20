/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        
        if (l2 == null)
            return l1;
        
        ListNode nodeP = l1;
        ListNode nodeQ = l2;
        ListNode head = null;
        ListNode curr = null;
        
        if (nodeP.val < nodeQ.val) {
            head = nodeP;
            nodeP = nodeP.next;
        } else {
            head = nodeQ;
            nodeQ = nodeQ.next;
        }
        
        curr = head;
        
        while (nodeP != null && nodeQ != null) {
            if (nodeP.val < nodeQ.val) {
                curr.next = nodeP;
                nodeP = nodeP.next;
            } else {
                curr.next = nodeQ;
                nodeQ = nodeQ.next;
            }
            
            curr = curr.next;
        }
        
        if (nodeP == null) {
            curr.next = nodeQ;
        }
        
        if (nodeQ == null) {
            curr.next = nodeP;
        }
        
        return head;
    }
}