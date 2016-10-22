/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        
        ListNode stepOne = head;
        ListNode stepTwo = head.next;
        
        while (stepTwo != null) {
            if (stepOne == stepTwo)
                return true;
            
            stepOne = stepOne.next;
            
            stepTwo = stepTwo.next;
            if (stepTwo == null)
                break;
                
            stepTwo = stepTwo.next;
        }
        
        return false;
    }
}