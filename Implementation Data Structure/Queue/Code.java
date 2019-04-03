class MyCircularQueue {

    int size;
    int[] data;
    int head;
    int tail;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        size = k;
        data = new int[k];
        head = -1;
        tail = -1;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(!isFull()) {
           if(head == -1) {
               head++;
               tail++;
               data[tail] = value;
           } else if (tail == size - 1) {
               tail = 0;
               data[tail] = value;
           } else {
               tail++;
               data[tail] = value;
           }
            return true;
        }
        return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(!isEmpty()) {
            //remove last one
            if(head == tail) {
                head = -1;
                tail = -1;
            } else if(head == size - 1) {
                head = 0;
            } else {
                head++;
            }
            
            return true;
        }
        return false;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty()) {
            return data[head];
        }
        return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(!isEmpty()) {
            return data[tail];
        }
        return -1;
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(head == -1) {
            return true;
        }
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
