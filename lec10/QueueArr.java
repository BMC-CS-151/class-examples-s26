public class QueueArr {
    private Integer arr[];
    private int lastElemIdx; //marks the index of the last element
    private int firstElemIdx;

    public QueueArr() {
        arr = new Integer[200];
        lastElemIdx = -1;
        firstElemIdx = 0;
    }

    public boolean isEmpty() {
        return firstElemIdx > lastElemIdx;
    }

    private boolean isFull() {
        return lastElemIdx == arr.length - 1;
    }

    public int first() {
        //CASE 1: empty 
        if (isEmpty()) throw new MyQException("no elements");
        //CASE 2: non-empty

        return arr[firstElemIdx];
    }

    public void enqueue(int e) {
        //CASE 1: full
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }

        //CASE 2: non full
        lastElemIdx += 1;
        arr[lastElemIdx] = e;
    }

    public int dequeue() {
        //FIFO
        //CASE 1: empty
        if (isEmpty()) {
           throw new MyQException("Cannot dequeue from an empty queue"); 
        }
        //CASE 2: non-empty

        int temp = arr[firstElemIdx];
        firstElemIdx += 1;
        return temp;
    }

    public static void main(String[] args) {

        QueueArr q = new QueueArr();

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
