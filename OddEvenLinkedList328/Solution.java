/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        
        ListNode newHead = head;
        ListNode currOdd = head;
        ListNode currEven = head.next;
        ListNode evenHead = currEven;
        
        while (currEven != null) {
            if (currOdd.next == null || currOdd.next.next == null)
                currOdd.next = evenHead;
            else
                currOdd.next = currOdd.next.next;
            
            if (currEven.next != null)
                currEven.next = currEven.next.next;
            
            currOdd = currOdd.next;
            currEven = currEven.next;
        }
        
        if (currOdd != evenHead)
            currOdd.next = evenHead;
        
        return newHead;
    }
}