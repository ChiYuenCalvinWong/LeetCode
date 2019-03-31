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
    public ListNode detectCycle(ListNode head) {
        //Check if head is null or head.next is null
        if(head == null || head.next == null) {
            return null;
        }
        
        //init the slow and fast pointers point to the head
        ListNode slow = head;
        ListNode fast = head;
        
        //First, we need to find the loop and the point which slow and fast meet.
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                    
                }
                return slow;
            }
        }
        return null;
    }
}
