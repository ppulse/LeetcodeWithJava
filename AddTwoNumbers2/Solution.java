/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        
        if (l2 == null)
            return l1;
        
        int sum = l1.val + l2.val;
        int carry = sum / 10;
        sum %= 10;
        
        ListNode resultHead = new ListNode(sum);
        ListNode curr = resultHead;
        l1 = l1.next;
        l2 = l2.next;
        
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum %= 10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while (l1 != null) {
            sum = l1.val + carry;
            carry = sum / 10;
            sum %= 10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;
            
            l1 = l1.next;
        }
        
        while (l2 != null) {
            sum = l2.val + carry;
            carry = sum / 10;
            sum %= 10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;
            
            l2 = l2.next;
        }
        
        if (carry != 0) {
            curr.next = new ListNode(carry);
            curr = curr.next;
        }
        
        return resultHead;
    }
}