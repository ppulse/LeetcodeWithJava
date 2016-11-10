/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        
        ListNode currNodeA = headA;
        ListNode currNodeB = headB;
        
        int lenA = 0;
        while (currNodeA != null) {
            currNodeA = currNodeA.next;
            lenA++;
        }
        
        int lenB = 0;
        while (currNodeB != null) {
            currNodeB = currNodeB.next;
            lenB++;
        }
        
        int diff = 0;
        
        if (lenA > lenB) {
            currNodeA = headA;
            currNodeB = headB;
            diff = lenA - lenB;
        } else {
            currNodeA = headB;
            currNodeB = headA;
            diff = lenB - lenA;
        }
        
        while (diff-- > 0) {
            currNodeA = currNodeA.next;
        }
        
        ListNode result = null;
        
        while (currNodeA != null && currNodeB != null) {
            if (currNodeA != currNodeB) {
                currNodeA = currNodeA.next;
                currNodeB = currNodeB.next;
            } else {
                result = currNodeA;
                break;
            }
        }
        
        return result;
    }
}