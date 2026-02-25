public class QueueLL<E> implements Queue  {
    private LinkedList ll; //SLL with tail

    public QueueLL() {
        ll = new LinkedList();
    }

    /**
     * Returns the number of elements in the queue.
     * @return number of elements in the queue
     */
    public int size() {
        return ll.size();
    }

    /**
     * Tests whether the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return ll.size() == 0;
    }

    /**
     * Inserts an element at the rear of the queue.
     * @param e     the element to be inserted
     */
    public void enqueue(Object e) {
            ll.insertTailFast(e);
    }

    /**
     * Returns, but does not remove, the first element of the queue.
     * @return top element in the queue (or null if empty)
     */
    public E first() {
       return (E) ll.firstElem(); 
    }

    /**
     * Removes and returns the first element from the queue.
     * @return element removed (or null if empty)
     */
    public Object dequeue() {
        return ll.removeHead();
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();

        System.out.println("Queue empty? " + q.isEmpty());

        // enqueue elements
        System.out.println("\nEnqueueing 10, 20, 30");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue empty? " + q.isEmpty());

        // check first element
        System.out.println("\nFirst element: " + q.first());

        // dequeue elements
        System.out.println("\nDequeuing...");
        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        // check first again
        System.out.println("\nFirst element: " + q.first()); // 30

        // enqueue more
        System.out.println("\nEnqueueing 40");
        q.enqueue(40);

        // dequeue remaining
        System.out.println("\nDequeuing remaining elements...");
        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40

        System.out.println("\nQueue empty? " + q.isEmpty());

        // test error case
        System.out.println("\nAttempting to dequeue from empty queue...");
        q.dequeue(); // should throw exception
    }
}
