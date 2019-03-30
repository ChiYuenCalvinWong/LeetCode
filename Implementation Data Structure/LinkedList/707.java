class MyLinkedList {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    
    int size;
    ListNode head;
    ListNode tail;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = -1;
        head = new ListNode(-1);
        tail = new ListNode(-1);
        head.next = tail;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index > size) {
            return -1;
        }
        ListNode temp = head.next;
        
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        
        return temp.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode curr = new ListNode(val);
        
        curr.next = head.next;
        head.next = curr;
        size++;        
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode newtail = new ListNode(-1);
        
        tail.val = val;
        tail.next = newtail;
        tail = newtail;
        size++;
        

        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        

        if(index == size + 1) {
            addAtTail(val);
        } else if(index == 0) {
            addAtHead(val);
        } else if(size >= index) {
            ListNode temp = head;
            ListNode curr = new ListNode(val);
            
            for(int i = 0 ; i < index ; i++) {
                temp = temp.next;
            }
            curr.next = temp.next;
            temp.next = curr;
            size++;
        }
        
//         ListNode tettmp = head.next;
//         for(int i = 0; i <= size; i++){
//             System.out.println(tettmp.val);
//             tettmp = tettmp.next;
//         }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(size >= index) {
            ListNode temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
