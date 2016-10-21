/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode newHead = head.next;
        ListNode currNode = head;
        ListNode nextNode = currNode.next;
        
        while (currNode != null && nextNode != null) {
            ListNode tmpNode = nextNode.next;
            
            nextNode.next = currNode;
            
            if (tmpNode != null && tmpNode.next != null) {
                currNode.next = tmpNode.next;
                nextNode = tmpNode.next;
            } else {
                currNode.next = tmpNode;
                nextNode = null;
            }
            
            currNode = tmpNode;
        }
        
        return newHead;
    }
}