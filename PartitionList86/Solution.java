/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        
        ListNode ltHead = null;
        ListNode ltNode = null;
        ListNode geHead = null;
        ListNode geNode = null;
        ListNode currNode = head;
        
        while (currNode != null) {
            if (currNode.val < x) {
                if (ltHead == null) {
                    ltHead = currNode;
                    ltNode = currNode;
                } else {
                    ltNode.next = currNode;
                    ltNode = ltNode.next;
                }
            } else {
                if (geHead == null) {
                    geHead = currNode;
                    geNode = currNode;
                } else {
                    geNode.next = currNode;
                    geNode = geNode.next;
                }
            }
            
            currNode = currNode.next;
        }
        
        if (geNode != null) {
            geNode.next = null;
        }
        
        if (ltNode != null) {
            ltNode.next = geHead;
        } else {
            ltHead = geHead;
        }
        
        return ltHead;
    }
}