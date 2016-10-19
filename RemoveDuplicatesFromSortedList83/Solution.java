/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode currNode = head;
        ListNode nextNode = currNode.next;
        
        while (nextNode != null) {
            while (nextNode != null && nextNode.val == currNode.val)
                nextNode = nextNode.next;
            currNode.next = nextNode;
            currNode = nextNode;
        }
        
        return head;
    }
}