/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k < 0)
            return null;
        
        k %= getLength(head); 
        
        ListNode newHead = head;
        
        ListNode fast = head;
        ListNode slow = head;
        
        int currIndex = 0;
        
        while (fast != null && currIndex < k) {
            fast = fast.next;
            currIndex++;
        }
        
        if (fast == null || currIndex < k) {
            return head;
        }
        
        ListNode prevSlow = slow;
        ListNode prevFast = fast;
        while (slow != null && fast != null) {
            prevFast = fast;
            fast = fast.next;
            prevSlow = slow;
            slow = slow.next;
        }
        
        if (slow == null) {
            newHead = head;
        } else {
            newHead = slow;
            prevFast.next = head;
            prevSlow.next = null;
        }

        return newHead;
    }
    
    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}