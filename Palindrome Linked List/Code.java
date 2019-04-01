/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        
        ListNode temp = head;
        int size = 0;
        //1,2,3,4
        while(temp.next != null) {
            size++;
            temp = temp.next;
        }

        temp = head;
        if(size % 2 == 1) {
            size++;
        }
    
        for(int i = 0; i < size / 2; i++) {
            temp = temp.next;
        }
 

        //reverse the second part of the linked list
        ListNode root = temp;
        ListNode nroot;
  
        while(root.next != null) {
            nroot = root.next;
            root.next = root.next.next;
            nroot.next = temp;
            temp = nroot;
        }
        
        //Compare
        for(int i = 0; i < size / 2; i++) {
            if(head.val != temp.val) {
                return false;
            }
            head = head.next;
            temp = temp.next;
        }
        
        
        return true;
    }
}
