/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        /*
        1 - 2 - 3 - 4 - 5
        R   N
        
        N = 2
        1 - 3 - 4 - 5
        R
        
        2 - 1 - 3 - 4 - 5
        N   R
        H
        -------------------------
        2 - 1 - 3 - 4 - 5
        H   R   N
        
        2 - 1 - 4 - 5
        H   R
        
        3 - 2 - 1 - 4 - 5
        N       R
        H
        
        */
        ListNode root = head;
        ListNode nroot = head.next;
        
        
        
        
        while(root.next != null) {
            nroot = root.next;
            root.next = root.next.next;
            nroot.next = head;
            head = nroot;
        }

        

        return head;
    }
}
