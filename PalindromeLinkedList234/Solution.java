/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        ListNode currNode = head;
        int len = 0;
        
        while (currNode != null) {
            stack.push(currNode.val);
            currNode = currNode.next;
            len++;
        }
        
        currNode = head;
        int halfLen = len >> 1;
        for (int i = 0; i <= halfLen; i++) {
            if (currNode.val != stack.pop()) {
                return false;
            }
            
            currNode = currNode.next;
        }
        
        return true;
    }
}