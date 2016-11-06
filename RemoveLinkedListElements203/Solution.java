/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode currNode = head;
        
        while (currNode != null && currNode.val == val) {
            currNode = currNode.next;
        }
        
        ListNode prevNode = currNode;
        ListNode newHead = currNode;
        
        while (currNode != null) {
            ListNode nextNode = currNode.next;
            
            if (currNode.val == val) {
                prevNode.next = currNode.next;
                currNode.next = null;
                currNode = nextNode;
            } else {
                prevNode = currNode;
                currNode = currNode.next;
            }
        }
        
        return newHead;
    }
}