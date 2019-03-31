/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        ListNode even = head.next;
        ListNode odd = head;
        ListNode temp = head.next;
        
        while(odd.next != null && even.next != null) {
            
            if(odd.next.next != null) {
                odd.next = odd.next.next;
                odd = odd.next;
            } 

            if(even.next.next != null) {
                even.next = even.next.next;
                even = even.next;
            }

        }
        odd.next = temp;
        if(even.next != null) {
            even.next = null;
        }
        return head;
        
    }
}
