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
        if(headA == null || headB == null) {
            return null;
        }
        
        ListNode A = headA;
        ListNode B = headB;
        int sizeA = 0;
        int sizeB = 0;
        
        //get the length from A
        while(A.next != null) {
            A = A.next;
            sizeA++;
        }
        
        //get the length from B
        while(B.next != null) {
            B = B.next;
            sizeB++;
        }
        
        int diff = 0;
        //Compare the A and B
        if(sizeA > sizeB) {
            diff = sizeA - sizeB;
            A = headA;
            B = headB;
            while(diff > 0) {
                A = A.next;
                diff--;
            }
        }else if (sizeB > sizeA) {
            diff = sizeB - sizeA;
            B = headB;
            A = headA;
            while(diff > 0) {
                B = B.next;
                diff--;
            }
        }else {
            A = headA;
            B = headB;
        }
        
        while(A != B) {
            A = A.next;
            B = B.next;

        }
        if(A == B) {
                return A;
        } 
        return null;
        
    }
}
