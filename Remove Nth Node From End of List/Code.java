/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        
        //slow and fast pointer will have n distance between each other
        //when fast pointer arrive the last element
        //slow pointer is at the prev node of the target node;
        //delete the node using one line
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        
        if(fast == null) {
            return head.next;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return head;
    }
}
