/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
//         if(head == null) {
//             return null;
//         }
        
//         while(head.val == val) {
//             if(head.next == null) {
//                 return null;
//             }
//             head = head.next;
//         }
        
//         ListNode root = head;
//         while(root.next != null) {
//             if(root.next.next == null && root.next.val == val) {
//                 root.next = null;
//                 break;
//             }
//             if(root.next.val == val) {
//                 root.next = root.next.next;
//                 continue;
//             }
//             root = root.next;
//         }
        if(head == null) {
            return null;
        }
        
        while(head.val == val) {
            if(head.next == null) {
                return null;
            }
            head = head.next;
        }
        
        ListNode root = head;
        while(root.next != null) {
            if(root.next.val == val) {
                if(root.next.next == null) {
                    root.next = null;
                    break;
                }
                root.next = root.next.next;
                continue;
            }
            root = root.next;
        }
        return head;
    }
}
